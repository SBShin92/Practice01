package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex38.java]
총 금액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세

 */

public class Ex38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("전체금액을 입력해주세요:  ");
		int totalPrice = scanner.nextInt();
		int realPrice = totalPrice;
		
		if ((totalPrice % 1000) != 0)
			realPrice -= totalPrice % 1000;
		
		System.out.println("실제 지불 금액은 " + realPrice + " 입니다.");
		
		
		scanner.close();
	}
	
}
