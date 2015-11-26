package com.abhishekchavan;

public class NextHighestSameDigitNumber {

	/**
	 * 12361 12613
	 * 12365 12
	 *  12354 98261 98612
	 * 
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public static int nextHighestSameDigit(int number) throws Exception {
		String str = ((Integer) number).toString();
		
		char[] charArray = str.toCharArray();
		char[] finalCharInput = new char[charArray.length];

		int placeChangePoint = -1;
		char digitChanged = '0';
		for (int i = charArray.length - 1; i > 0; i--) {
			if (charArray[i] > charArray[i - 1]) {
				placeChangePoint = i -1;
				digitChanged = charArray[i-1];
			}
		}
		
		
		
		if (placeChangePoint == -1) {
			throw new Exception("Could not do anything");
		} else {
			int minimumPoint = -1;
			char minimum = '0';
			for(int i = placeChangePoint +1; i >= charArray.length-1; i++){
				if(minimum > charArray[i]){
					minimum = charArray[i];
					minimumPoint = i;
				}
			}
			
			//
		}
		
		
		String finalSt = new String(finalCharInput);
		
		return Integer.parseInt(finalSt);

	}
}
