package com.abhishekchavan;

public class CheckIfNumberPrime {

	public static boolean isNumberPrime(int number) {
		boolean isPrime = true;

		int squareRoot = new Double(Math.sqrt(number)).intValue();
		if (squareRoot == Math.sqrt(number)) {
			isPrime = false;
		} else {
			for(int i=2;i<squareRoot;i++){
				if(number%i == 0){
					isPrime = false;
					break;
				}
			}
		}

		return isPrime;
	}
	
	public static void main(String[] args) {
		System.out.println(isNumberPrime(257));
		System.out.println(isNumberPrime(9));
		System.out.println(isNumberPrime(17*17));
		System.out.println(isNumberPrime(17));
	}
}
