package com.greedy.level01.basic;

public class Calculator {

	// 1. void는 return 값이 없기 때문에 Calculator 클래스에 syso를 작성해야 한다!
	public void checkMethod() {
		System.out.println("메소드 호출 확인");
	}
	
	// 2.
	public int sum1to10() {
		return 1+2+3+4+5+6+7+8+9+10;
	
//		int sum = 1+2+3+4+5+6+7+8+9+10;
//		return sum;
	}
	
	// 3. void는 return 값이 없기 때문에 Calculator 클래스에 syso를 작성해야 한다!
	public void checkMaxNumber(int a, int b) {
		int max = a > b ? a : b;
		System.out.println("두 수 중 큰 수는 " + max + "이다.");
	}
	
	// 4.
	public int sumTwoNumber(int a, int b) {
		return a + b;
	
//		int sum = a + b;
//		return sum;
	}
	
	// 5.
	public int minusTwoNumber(int a, int b) {
		return a - b;
	}

}