package org.fil;

import java.io.File;

public class mkdirDirectory {
public static void main(String[] args) {
	
	// Create an object for file class and mention the path
	
	// File refName = new File("path");
	
	File file = new File("D:\\Mi\\abi\\puru\\java");
	
	// To create a folder
	
	//boolean mkdir = file.mkdir();
	//System.out.println(mkdir);
	
	// To Create an Nested folders
	
	boolean mkdirs = file.mkdirs();
	System.out.println(mkdirs);
	
	
	
}
}
