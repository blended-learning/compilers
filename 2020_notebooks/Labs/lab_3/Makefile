CP=/data/shared/antlr-4.9.1-complete.jar:.
name = lab3_release

all:
	antlr -visitor mygrammar/*.g4
	javac -cp $(CP) mygrammar/*.java

clean:
	rm -f mygrammar/*.interp mygrammar/*.java mygrammar/*.tokens mygrammar/*.class

reset:
	cp -rT /data/shared/$(name) /data/My_Notebooks/$(name)
