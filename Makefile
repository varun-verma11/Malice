all: compiler.jar
	cp make.txt compile && chmod +x compile

clean: 
	rm -rf compile
