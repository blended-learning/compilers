CP=/data/shared/antlr-4.9.1-complete.jar:.
all:
	antlr -visitor mygrammar/*.g4
	javac -cp $(CP) mygrammar/*.java

clean:
	rm -f mygrammar/*.interp mygrammar/*.java mygrammar/*.tokens mygrammar/*.class
