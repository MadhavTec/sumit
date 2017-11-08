package com.techo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheWinner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		int andrea[] = new int[size];
		for(int i=0;i<size;i++){
			andrea[i]=Integer.parseInt(reader.readLine());	
		}
		size = Integer.parseInt(reader.readLine());
		int maria[] = new int[size];
		for(int i=0;i<size;i++){
			maria[i]=Integer.parseInt(reader.readLine());	
		}
		
		String gameType = reader.readLine();
		
		String winner = winner(maria,andrea,gameType);
		System.out.println(winner);
		
	}

	private static String winner(int[] maria, int[] andrea, String gameType) {
		String winner = null;
		int i;
		int mariaScore=0;
		int andreaScore = 0;
		if(gameType.equals("Even")){
			i = 0;
		}else{
			i = 1;
		}
		
		while(i<maria.length){
			mariaScore = mariaScore+maria[i]-andrea[i];
			andreaScore = andreaScore+andrea[i]-maria[i];
			i = i+2;
		}
		if(mariaScore>andreaScore){
			winner ="Maria";
		}
		else if(andreaScore>mariaScore){
			winner ="Andrea";
		}
		else{
			winner = "Tie";
		}
		
		return winner;
	}

	
}

