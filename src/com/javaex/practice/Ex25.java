package com.javaex.practice;
/* [Ex
2 5 j ava]
아래의 출력결과를 예상하여 작성하세요.
(
코드를 작성해서 예상과 맞는지 확인해 보세요
*/
/*
정답 :
논리에 맞게!

false
true
false
true
true

*/
public class Ex25 {

	public static void main(String[] args) {
	
		int a = 13;
		
		System.out.println( (a>13) && (a>=13) );
		System.out.println( (a>13) || (a>=13) );
		System.out.println( (a/3 == 4 ) && (a%3 == 2) );
		System.out.println( (a/3 == 4 ) || (a%3 == 2) );
		System.out.println( (a/3 == 4) && (a%3 == 2) || (a/3 == 4) );
	}
	
}
