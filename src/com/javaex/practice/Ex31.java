package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex31.java]
상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요

 */

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상품가격:  ");
		double price = scanner.nextDouble();
		System.out.print("받은돈:    ");
		double gaveMoney = scanner.nextDouble();
		System.out.println("==============");
		
		System.out.println("받은돈:    " + gaveMoney);
		System.out.println("상품가격:  " + price);
		System.out.println("부가세:    " + (price / 10.0));
		System.out.println("잔액:      " + (gaveMoney - price));
		
		
		scanner.close();
		
	}
	
}
