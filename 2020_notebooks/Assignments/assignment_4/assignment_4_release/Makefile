LIB = /data/shared/antlr-4.9.1-complete.jar
all:
	antlr -visitor src/*.g4
	javac -cp $(LIB) -d . src/*.java
	kotlinc -cp $(LIB):. src/backend.kt

clean:
	rm -rf ./backend ./mygrammar src/*.java src/*.tokens src/*.interp ./META-INF
