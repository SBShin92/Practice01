package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex34.java]
[문제] 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
 */


public class Ex34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("화씨:  ");
		double fah = scanner.nextDouble();
		
		double cel = (5.0 / 9.0) * (fah - 32.0);
		System.out.println("화씨 " + fah + " 의 섭씨온도는 " + cel + " 입니다.");
		
		scanner.close();
	}
	
}
