package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex28.java]
원화를 달러화로 계산하는 프로그램을 작성하세요. (환율 1달러 = 1230.95원 상수로 지정)
 */
// 답안 코드
public class Ex28 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final double DALTOWON = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		double won = scanner.nextDouble();
		
		System.out.print("받으실 달러는 " + (won / DALTOWON + "\n"));

		scanner.close();
	}
	
}
