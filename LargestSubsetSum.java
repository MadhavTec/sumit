package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSubsetSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		int lcm[] = new int[size];
		for(int i=0;i<size;i++){
			lcm[i] = Integer.parseInt(reader.readLine());
		}
		long maxSum[] = maxSubsetSum(lcm);
		for(long sum:maxSum){
			System.out.println(sum);
		}

	}

	 static long[] maxSubsetSum(int[] lcm) {
		
		 long subSetSum[] = new long[lcm.length];
		 for(int i=0;i<lcm.length;i++){
			 for(int j=1;j<=lcm[i]/j;j++){
				if(lcm[i]%j==0 && lcm[i]%(lcm[i]/j)==0){
					if(j==lcm[i]/j){
						subSetSum[i]=subSetSum[i]+j;	
					}else{
						subSetSum[i]=subSetSum[i]+lcm[i]/j+j;
					}
				}
			 }
			 
		}
		
		return subSetSum;
	}

}
