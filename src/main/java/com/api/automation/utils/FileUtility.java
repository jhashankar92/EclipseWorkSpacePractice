package com.api.automation.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.api.automation.constants.PathConstants;

public class FileUtility {

	public static void deleteDirectory(File file) {
		// store all the paths of files and folders present
		// inside directory
		for (File subfile : file.listFiles()) {
			// recursively call function to empty subfolder
			if (subfile.isDirectory()) {
				deleteDirectory(subfile);
			}
			// delete files and empty subfolders
			subfile.delete();
		}
	}

	public static List<String> getFileName() {
		File folder = new File(PathConstants.DOWNLOAD_FILE_PATH);
		File[] listOfFiles = folder.listFiles();
		List<String> fileName = new ArrayList<String>();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File Name " + listOfFiles[i].getName());
				fileName.add(listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
		return fileName;
		
	}
	
	public static String saveDataToFile(String response) {
		getRunningMethodName();
		Path path = Paths.get(PathConstants.RESPONSE_FILE_PATH+getRunningMethodName()+".json");
		//String test ="Tesing";
		try {
			java.nio.file.Files.writeString(path, response, StandardCharsets.UTF_8);
			System.out.println(path);
			System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path.toString();
		
	}
	
	public static String getRunningMethodName() {
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println();
		return ste[3].getMethodName();
	}
	

	public static void main(String[] args) {
		//File file = new File(PathConstants.DOWNLOAD_FILE_PATH);
		//deleteDirectory(file);
		//getFileName();
		//getRunningMethodName();
		saveDataToFile("Response");
			}

}
