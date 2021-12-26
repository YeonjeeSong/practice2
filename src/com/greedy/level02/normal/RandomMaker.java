package com.greedy.level02.normal;

public class RandomMaker {

	// 1.
	public static int randomNumber(int min, int max) {
		int random = (int) (Math.random() * (max - min + 1)) + min;
		return random;
	}
		
	// 2.
//	public static String randomUpperAlpabet(int length) {
//		
//	}
	
	// 3.
	public static String rockPaperScissors() {
		int rps = (int) (Math.random() * 3);
		return rps == 0 ? "가위" : (rps == 1 ? "바위" : "보");
	}
	
	// 4. recipe 참조
	public static String tossCoin() {
		int toss = (int) (Math.random() * 2);
		return toss == 0 ? "앞면" : "뒷면";
	}
		
}
