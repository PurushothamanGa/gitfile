package org.fil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class excelFile {
	public static void main(String[] args) throws IOException{
		
		File file = new File("D:\\Mi\\puru\\pur.xlsx");
		
//		boolean mkdirs = file.mkdirs();
//		System.err.println(mkdirs);		
//		
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		FileUtils.write(file, "Purushoth and Mithran");
		
		List<String> readLines = FileUtils.readLines(file);
		System.out.println(readLines);
		
		FileUtils.write(file, "Abi and mithra purus");
		List<String> readLines2 = FileUtils.readLines(file);
		System.out.println(readLines2);

			
	}

}
