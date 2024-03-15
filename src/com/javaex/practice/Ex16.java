package com.javaex.practice;

/*
 * [Ex16.java]
아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요

 */
public class Ex16 {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
/*
정답 :
a의 경우, 전위연산자가 붙은 x 변수로 계산값이 있기 때문에 2 * 2가 된다.
b의 경우, y의 현재 값을 행이 끝나기 전까지 올리지 않고 있다가 행이 끝난 후 올라가기 때문에 b 값은 1 * 2가 된다.
*/