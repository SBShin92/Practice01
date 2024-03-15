package com.javaex.practice;

/*
 * [Ex14.java]
아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
 */
/*
정답 :
전위연산자는 연산이 끝나고 출력이 될 것이고,
후위연산자는 출력 후 연산을 할 것이다.
5
6
6
6
7
6
6
6
5
*/
public class Ex14 {

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		
	}

}
