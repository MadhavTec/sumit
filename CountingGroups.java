package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingGroups {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		int matrix[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = Integer.parseInt(reader.readLine());
			}
		}
		int q = Integer.parseInt(reader.readLine());
		int ret[] = new int[q];
		for(int i=0;i<q;i++){
			ret[i] = Integer.parseInt(reader.readLine());
		}
		
		int result[] = countingGropus(matrix,ret);
		for(int numbers:result){
			System.out.println(numbers);	
		}
	}

	private static int[] countingGropus(int[][] matrix, int[] ret) {
		int result[] = new int[ret.length];
		for(int retElement:ret){
			
		}
		
		return result;
	}

}
