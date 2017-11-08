package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InTheFuture {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int k = Integer.parseInt(reader.readLine());
		int p = Integer.parseInt(reader.readLine());
        int minDays = minNum(a,k,p); 
        System.out.println(minDays);
	}

	private static int minNum(int a, int k, int p) {
		int counter = 0;
		if(a>=k){
			return -1;
		}else{
		 counter++;
		while(a+p >= k){
			counter++;
			a = a * counter;
			k = k * counter;
		}
		}
		return counter;
	}

}
