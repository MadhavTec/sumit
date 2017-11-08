package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PsychometricTesting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		int scores[] = new int[size];
		for (int i = 0; i < size; i++) {
			scores[i] = Integer.parseInt(reader.readLine());
		}
		size = Integer.parseInt(reader.readLine());
		int lowerLimit[] = new int[size];
		for (int i = 0; i < size; i++) {
			lowerLimit[i] = Integer.parseInt(reader.readLine());
		}
		size = Integer.parseInt(reader.readLine());
		int upperLimit[] = new int[size];
		for (int i = 0; i < size; i++) {
			upperLimit[i] = Integer.parseInt(reader.readLine());
		}

		int jobOffers[] = jobOffers(scores, lowerLimit, upperLimit);
		for(int job:jobOffers){
			System.out.println(job);
		}

	}

	static int[] jobOffers(int[] scores, int[] lowerLimit, int[] upperLimit) {
		int jobOffer[] = new int[lowerLimit.length];
		for (int i = 0; i < lowerLimit.length; i++) {
			int offer=0;
			for (int j = 0; j < scores.length; j++) {
				if(scores[j]>=lowerLimit[i] && scores[j]<=upperLimit[i]){
					offer++;
				}
			}
			jobOffer[i]=offer;
		}

		return jobOffer;
	}

}
