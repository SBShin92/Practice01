package com.javaex.practice;

/*
 * [Ex24.java]
다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
 */
/*
정답 :
기존 5/9의 경우, 둘 다 정수형이기 때문에 그 값이 0이라 0 * x로 결과값이 0으로 나온다.abstract
5/9의 값을 실수로 만들면 정상적으로 나온다.
*/
public class Ex24 {

	public static void main(String[] args) {
		
		double f=80.0;
		System.out.println((double)5/(double)9*(f-32.0));
	}
	
}
