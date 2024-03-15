package com.javaex.practice;

/*
 * Ex19.java]
아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
 */

public class Ex19 {

	public static void main(String[] args) {
	
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02);
		
		System.out.println(result);
		System.out.println(num01);
		System.out.println(num02);
	}
	
}

/*
정답 :
num01의 경우, 행이 끝나고 증가하기 때문에 result = 40 + 51이라고 보는 것이 맞다.

result: 91
num01: 41
num02: 51

*/