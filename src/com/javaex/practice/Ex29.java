package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex29.java]
직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(너비, 높이 변수 double형으로 작성)

보기답안의 둘레 넓이 값이 반대인것같아요
 */


// 답안 코드
public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("너비를 입력하세요:");
		double width = scanner.nextDouble();
		System.out.print("높이를 입력하세요:");
		double height = scanner.nextDouble();
		
		System.out.println("사각형의 둘레는 " + (2 * (width + height)));
		System.out.println("사각형의 넓이는 " + (width * height));
		scanner.close();
	}
	
	
}
