package it.alpi.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Utils {
	
	public static ArrayList<String> readFile(String pathFile) {
		
		// Read from the fake db 
				File file = new File(pathFile);
				ArrayList<String> list = new ArrayList<String>();
				try {
					java.util.Scanner sc = new java.util.Scanner(file);
					
					while ( sc.hasNextLine()) {
						
						String data = sc.nextLine();
						
						list.add(data);
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return list;
	}

}
