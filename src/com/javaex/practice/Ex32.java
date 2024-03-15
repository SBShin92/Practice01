package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex32.java]
사용자로부터 밑변, 높이 값을 입력 받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
 */

public class Ex32 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double width, height;
		System.out.print("가로: ");
		width = scanner.nextDouble();
		System.out.print("세로: ");
		height = scanner.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + (width * height / 2.0) + " 입니다.");
		
		
		scanner.close();
	
	}
	
	
}
