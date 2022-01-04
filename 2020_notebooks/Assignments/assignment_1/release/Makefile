CP = /data/shared/antlr-4.9.1-complete.jar:.
all:
	antlr mylexer/*.g4
	javac -cp $(CP) mylexer/*.java

clean:
	rm -f mylexer/*.java mylexer/*.interp mylexer/*.tokens mylexer/*.class
