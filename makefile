all: Image.java
	javac Image.java
	java Image
	display image.ppm
clean:
	rm *.class
	rm *.ppm