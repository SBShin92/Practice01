package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex30.java]
마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
 */
// 답안 코드
public class Ex30 {

	public static void main(String[] args) {
		final double MTOKM = 1.609;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		double mile = scanner.nextDouble();
		
		System.out.println(mile + "마일은 " + (mile * MTOKM) + "킬로미터 입니다.");
		
		scanner.close();
	}
	
}
