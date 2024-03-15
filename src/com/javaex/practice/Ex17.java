package com.javaex.practice;

/*
 * [Ex17.java]
다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
(코드를 작성해서 오류가 없도록 변경해 보세요.)

 */
public class Ex17 {

	public static void main(String[] args) {
		int x, y;
		
		x = 10;
		y = 20;
		
		int sum;
		sum = x + y;
		
		System.out.println("합은 " + sum);
	}
}
/*
정답 :
변수 sum을 변수로 선언해주고, 행마다 세미콜론으로 닫고, 따옴표 수정
*/