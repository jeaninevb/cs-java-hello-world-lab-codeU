package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
	String javaVersion = System.getProperty("java.version");
	int index = javaVersion.indexOf('.');
	index = javaVersion.indexOf('.', index+1);
	return Double.parseDouble(javaVersion.substring(0, index));
    }

    public static void main(String[] args) {

	    // you can test the output of getVersion() here
 	Double version = getVersion();
	System.out.println("Java version: " + version);   
 }
}
