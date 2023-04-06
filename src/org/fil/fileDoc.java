package org.fil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class fileDoc {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Mi\\java.txt");
		
//		boolean mkdir = file.mkdir();
//		System.out.println(mkdir);
	
		// to create any file
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		
		//commons io 2.4 Jar - > paste and give build path
		
		FileUtils.write(file, "Welcome to Java Class" + '\n' +"Welcome to TS Class");
		List<String> readLines = FileUtils.readLines(file);
		System.out.println(readLines);
		
		
		
		
	}

}
