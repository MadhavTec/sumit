package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoCircles {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		String cordinates[] = new String[size];
		for (int i = 0; i < size; i++) {
			cordinates[i] = reader.readLine();
		}
		String info[] = circles(cordinates);
		for (String type : info) {
			System.out.println(type);
		}

	}

	static String[] circles(String[] info) {
		
		String type[] = new String[info.length];
		
		for (int i = 0; i < info.length; i++) {
			
			String cordinates[] = info[i].split(" ");
			int x1 = Integer.parseInt(cordinates[0]);
			int y1 = Integer.parseInt(cordinates[1]);
			int r1 = Integer.parseInt(cordinates[2]);
			int x2 = Integer.parseInt(cordinates[3]);
			int y2 = Integer.parseInt(cordinates[4]);
			int r2 = Integer.parseInt(cordinates[5]);
			
			int center1 = 0;
			int center2 = 0;
 		    
			if(x1==0){
				center1 = y1;
				center2 = y2;
			}else{
				center1 = x1;
				center2 = x2;
			}
			
			if(Math.abs(center1-center2) == r1+r2)
				type[i] = "Touching"; 
			else if(center1 == center2)
				type[i] = "Concentric";
			else if(Math.abs(center1-center2) < r1+r2)
				type[i] = "Intersecting";
			else if(Math.abs(center1-center2) > r1+r2)
				type[i] = "Disjoint-Outside";
			else {
				type[i] = "Disjoint-Inside";
			}
		}

		return type;
	}

}
