package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex26.java]
월급을 입력 받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.

 */
// 답안 코드
public class Ex26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("월급을 입력하세요: ");
		int pay = scanner.nextInt();
		
		System.out.println("10년동안 최대 저축액은 " + (pay * 120) + "원 입니다.");
		
		scanner.close();
	}
	
}
