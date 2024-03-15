package com.javaex.practice;


/*
 * [Ex18.java]
다음의 코드를 컴파일 할 때 오류가 발생한다. 오류의 원인은?
public class Ex18 {

	public static void main(String[] args) {
	
		int x;
		System.out.println(x);
	}
	
}
*/


/*
정답 :
x 선언 후 초기화를 해주지 않았기 때문
*/
public class Ex18 {

	public static void main(String[] args) {
	
		int x;
		x = 0;
		System.out.println(x);
	}
	
}