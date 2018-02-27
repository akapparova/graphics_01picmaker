all: Image.java
	javac Image.java
run: all
	java Image
clean:
	rm Image.class
	rm image.ppm