CP=/data/shared/antlr-4.9.1-complete.jar:.
name = lab5_release

all:
	antlr -visitor calculator/*.g4
	javac -cp $(CP) calculator/*.java

clean:
	rm -f calculator/*.interp calculator/*.java calculator/*.tokens calculator/*.class

reset:
	cp -rT /data/shared/$(name) /data/My_Notebooks/$(name)
