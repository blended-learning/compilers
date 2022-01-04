package backend
import org.antlr.v4.runtime.*
import mygrammar.*

/* ===================================================
   Implement the data containers for the different
   types of data in the programming language.
   =================================================== */

// The base data class
abstract class Data

data class StringData(val value: String) : Data()
data class IntData(val value: Int): Data()








/* ===================================================
   Modify the Context class if necessary to support
   the scoping rules of your programming language.
   =================================================== */

// The context
class Context: HashMap<String, Data>()







/* ===================================================
   Implement variables types of expressions
   supported by the programming langauge
   =================================================== */

// The expressions

abstract class Expr {
    abstract fun eval(scope: Context): Data
}






/* ===================================================
   Implement the SDD based compiler using the
   ANTLR visitor model.
   =================================================== */

class Compiler: PLBaseVisitor<Expr>() {
}
