package com.techo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeResponses {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();
		reader = new BufferedReader(new FileReader(fileName+".txt"));
        String line = null;
        int records = 0;
        int totalBytes = 0;
		while((line=reader.readLine()) != null){
			int bytes = Integer.parseInt(line.substring(line.lastIndexOf(" ")+1, line.length()));
			if(bytes>5000){
				records++;
				totalBytes+=bytes;
				
			}
			
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter("bytes_"+fileName+".txt"));
		writer.write(String.valueOf(records));
		writer.newLine();
		writer.write(String.valueOf(totalBytes));
		writer.flush();
		
	}

}
