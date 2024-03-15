package com.javaex.practice;

/*
 * [Ex15.java]
아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
 */
public class Ex15 {

	public static void main(String[] args) {
		System.out.println( 12 / 5-3 );
		System.out.println( 5 + 19 % 3 );
		System.out.println( 2 + 2 / 2 );
		System.out.println( 29 % 3 + 29 / 3 );
		System.out.println( 29 % 3 + 18.0 / 4 );
		System.out.println( (14 + 7/2) / 4 );
		System.out.println( (14 + 7/2.0) / 5 );
	}

}
/*
정답 :
첫 째 행은 연산자랑 붙여 쓴다고 먼저 계산하는게 아니다. 나누기 먼저 하고 그 값을 뺄셈할 것이다.
연산자 순서에 맞춰 진행 되고, 실수가 있을 경우 실수로 자동 형변환되어 계산된다.
*/
