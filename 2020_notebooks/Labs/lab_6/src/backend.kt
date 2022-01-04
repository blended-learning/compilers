package backend

abstract class Data

// Wrapper for integer data
class IntData(val value: Int): Data() {
    override fun toString(): String
    = "Int($value)"
}

// Wrapper for boolean data
class BoolData(val value: Boolean): Data() {
    override fun toString(): String
    = if(value) {
        "yes"
    } else {
        "no"
    }
}

// A data wrapper for function objects.
// Each function object is characterized by
// its name, list of parameter names, and an expression
// for its body.

class FuncData(
    val name: String,
    val parameters: List<String>,
    val body: Expr
): Data() {
    override fun toString(): String {
        val params = parameters.joinToString(",")
        return "${name}($params)"
    }
}

/* =================================================================*/

// The scope with all the bindings
class Context(): HashMap<String, Data>() {
    // We can optionally specify a map when creating
    // a new scope
    constructor(map: Map<String, Data>): this() {
        this.putAll(map)
    }
}

/* =================================================================*/

// Base class for expressions
abstract class Expr {
    // each expression object must have
    // the method eval which returns
    // a data wrapper object
    // based on the current scope.
    abstract fun eval(scope:Context): Data
}

// Basic expression that specifies an integer
class IntLiteral(val value: Int): Expr() {
    override fun eval(scope:Context): Data 
    = IntData(value)
}

enum class Op {
    Add,
    Sub,
    Mul,
    Div
}

// Expression that supports arithmetic operations
class Arithmetic(
    val op: Op,
    val left: Expr,
    val right: Expr): Expr() {
    override fun eval(scope: Context): Data {
        val x = (left.eval(scope) as IntData).value
        val y = (right.eval(scope) as IntData).value
        return IntData(
            when(op) {
                Op.Add -> x + y
                Op.Mul -> x * y
                Op.Sub -> x - y
                Op.Div -> x / y
            }
        )
    }
}

// Variable assignment
// This will modify the current scope with
// the binding from `name` to the evaluated
// data value of `expr`.

class Bind(val name: String, val expr: Expr): Expr() {
    override fun eval(scope: Context): Data {
        val data = expr.eval(scope)
        scope[name] = data
        return data
    }
}

// Variable dereference
// This will resolve the `name` to
// the data value in the scope.  The resolution
// is done by `eval(...)`.

class Deref(val name: String): Expr() {
    override fun eval(scope: Context): Data {
        return scope.getOrDefault(name, IntData(0))
    }
}

// Block of multiple expressions
// This allows us to specify multiple expressions
// as a single block.  The evaluation of the whole
// block is the evaluation of the last expression.

class Block(val exprList: List<Expr>): Expr() {
    override fun eval(scope: Context): Data {
        var result: Data = IntData(0)
        exprList.forEach {
            result = it.eval(scope)
        }
        return result
    }
}

enum class Comparator {
    LT,
    LE,
    GT,
    GE,
    EQ,
    NE
}

// Logical comparison
// The comparison between two expressions
// is evaluated to a boolean data wrapper.

class Compare(
    val cmp: Comparator, val left: Expr, val right: Expr
): Expr() {
    override fun eval(scope: Context): Data {
        val x = (left.eval(scope) as IntData).value
        val y = (right.eval(scope) as IntData).value
        return BoolData(
            when(cmp) {
                Comparator.LT -> x < y
                Comparator.LE -> x <= y
                Comparator.GT -> x > y
                Comparator.GE -> x >= y
                Comparator.EQ -> x == y
                Comparator.NE -> x != y
            }
        )
    }
}

// Branching expression
// This evaluates either `trueExpr` or `falseExpr`
// depending on the evaluation result of `cond`.

class IfElse(
    val cond: Expr,
    val trueExpr: Expr,
    val falseExpr: Expr
) : Expr() {
    override fun eval(scope: Context): Data {
       val condData = cond.eval(scope)
       val flag = (condData as BoolData).value
       return if(flag) {
           trueExpr.eval(scope)
       } else {
           falseExpr.eval(scope)
       }
    }
}

// Loop expression
// This expression repeatedly evaluates `cond` expression
// and `body` expression until the `cond` expression
// evaluates to `false`.

// Note: for development purposes, we placed a safty-limit
// of `MAX_ITER` to catch infinite loop bugs.

class Loop(val cond: Expr, val body: Expr) : Expr() {
    override fun eval(scope: Context): Data {
        val MAX_ITER = 10000
        var flag = cond.eval(scope) as BoolData
        var result:Data = IntData(0)
        var counter = 0
        
        while(flag.value && counter < MAX_ITER) {
            result = body.eval(scope)
            counter += 1
            flag = cond.eval(scope) as BoolData
        }
        
        if(counter == MAX_ITER) {
            throw Exception("Did you forget to stop your loop? ${MAX_ITER}")
        }
        
        return result
    }
}

// Declaration of a function as an expression
// This expression updates the current scope
// with a new symbol binding that binds
// function name to a function data object.

class Declare(
    val funcname: String,
    val parameters: List<String>,
    val body: Expr
): Expr() {
    override fun eval(scope: Context): Data {
        val f = FuncData(funcname, parameters, body)
        scope[funcname] = f
        return f
    }
}

// Invocation of a function
// This expression will evaluate to the evaluation
// of the body of the function.  In the evaluation, a
// new subscope is created with the additional bindings
// from parameter names to arguments.

class Invoke(
    val funcname: String,
    val args: List<Expr>
): Expr() {
    override fun eval(scope: Context): Data {
        val f:Data? = scope[funcname]
        if(f == null) {
            throw Exception("function does not exist: ${funcname}")
        }
        if(!(f is FuncData)) {
            throw Exception("${f} is not a function.")
        }
        val func = f
        
        if(func.parameters.size != args.size) {
            throw Exception("${f} expects ${func.parameters.size} arguments")
        }
        
        // Create subscope
        val subscope = Context(scope)
        func.parameters.zip(
            args,
            fun(parameter: String, arg: Expr) {
                subscope[parameter] = arg.eval(scope)
            }
        )
        
        // Evaluate the body
        return func.body.eval(subscope)
    }
}
