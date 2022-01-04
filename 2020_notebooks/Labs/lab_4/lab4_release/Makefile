CP=/data/shared/antlr-4.9.1-complete.jar:.
name = lab4_release

all:
	antlr -visitor mygrammar/*.g4
	javac -cp $(CP) mygrammar/*.java

clean:
	rm -f mygrammar/*.interp mygrammar/*.java mygrammar/*.tokens mygrammar/*.class

reset:
	cp -rT /data/shared/$(name) /data/My_Notebooks/$(name)

step2:
	grun mygrammar.JSON tokens -tokens tokens_1.txt

step3:
	grun mygrammar.JSON tokens -tokens tokens_2.txt

step4:
	grun mygrammar.JSON json tokens_2.txt

step5:
	grun mygrammar.JSON json json_1.txt

step6:
	grun mygrammar.JSON json -tree json_1.txt
