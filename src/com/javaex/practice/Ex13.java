package com.javaex.practice;

/*
 * [Ex13.java]
다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
 */

public class Ex13 {
	
	public static void main(String[] args) {
		System.out.println(13/5);
		System.out.println((double)13/5);
		System.out.println(13/(double)5);
		System.out.println((double)13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5));
	}
}
/*
정답 :

제일 처음 행(13/5)는 형변환이 일어나지 않기 때문에 정수형으로 계산된다.
제일 마지막 행(double)(13/5)은 정수형으로 계산한 값을 형변환시킨 값을 출력하기 때문에 결과값이 다르다.


*/