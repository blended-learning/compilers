CP = /data/shared/antlr-4.9.1-complete.jar:. 
name = lab2

all:
	echo "make reset"

build:
	antlr ./lab2/*.g4
	javac -cp $(CP) ./lab2/*.java
    
reset:
	cp -rT /data/shared/labs/$(name)_release /data/My_Notebooks/$(name)
