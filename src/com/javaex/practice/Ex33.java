package com.javaex.practice;

/*
 * Ex33.java]
사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요.
 */

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("반지름: ");
		double rad = scanner.nextDouble();
		
		double vol = (4.0 / 3.0) * PI * rad * rad * rad;
		System.out.println("구의부피는: " + vol + " 입니다.");
		
		
		
		scanner.close();
		
	}
}
