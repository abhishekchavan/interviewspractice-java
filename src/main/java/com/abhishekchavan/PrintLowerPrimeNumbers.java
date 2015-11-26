package com.abhishekchavan;

import java.util.ArrayList;
import java.util.List;

public class PrintLowerPrimeNumbers {

	
	public List<Integer> printLowerPrimes(int number){
		boolean[] arraySieve = new boolean[number];
		for(int i =0 ; i < number ; i++){
			arraySieve[i] = true;
		}
		List<Integer> listOfPrimes = new ArrayList<>();
		
		/*
		 * Check for the square root.
		 */
		for(int i=2 ; i*i<number ; i++){
			if(arraySieve[i] == true){
				for(int j = i*2;j<number;j = j+i){
					arraySieve[j] = false;
				}
			}
		}
		
		for(int i =0 ;i< arraySieve.length;i++){
			if(arraySieve[i]){
				listOfPrimes.add(i);
			}
		}
		
		return listOfPrimes;
	}
	
	public static void main(String[] args) {
		PrintLowerPrimeNumbers lowerPrimeNumbers = new PrintLowerPrimeNumbers();
		System.out.println(lowerPrimeNumbers.printLowerPrimes(10));
	}
}
