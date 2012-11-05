ROOT=/exchange/Code/mdd/mdd-e2012-p6/dk.itu.ecdar.text.generator.mockup
BIN=$(ROOT)/bin
SRC=$(ROOT)/src


all: university

clean:
	rm -rf $(BIN)
	mkdir $(BIN)

university:
	javac -d $(BIN) -sourcepath $(SRC) $(SRC)/dk/itu/ecdar/text/generator/mockup/example/university/UniversityEnvironment.java
	
run-university:
	java -cp $(CLASSPATH):$(BIN) dk.itu.ecdar.text.generator.mockup.example.university.UniversityEnvironment $(SRC)/dk/itu/ecdar/text/generator/mockup/example/university/instructions1.txt