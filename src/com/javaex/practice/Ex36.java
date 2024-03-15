package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex36.java]
동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요.
 */

public class Ex36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int amount500 = scanner.nextInt();

		System.out.print("100원 개수: ");
		int amount100 = scanner.nextInt();
		
		System.out.print("50원 개수:  ");
		int amount50 = scanner.nextInt();
		
		System.out.print("10원 개수:  ");
		int amount10 = scanner.nextInt();
		
		
		int total = (amount500 * 500) + (amount100 * 100)
				 + (amount50 * 50) + (amount10 * 10);
		
		System.out.println("동전의 총합은 " + total + " 원 입니다.");
		
		scanner.close();
	}
	
	
}
