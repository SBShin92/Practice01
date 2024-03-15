package com.javaex.practice;

/*
 * [Ex20.java]
아래의 출력결과를 예상하여 작성하세요.
(코드를 작성해서 예상과 맞는지 확인해 보세요.)
 */
public class Ex20 {

	public static void main(String[] args) {
	
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);
		System.out.println(n);
	}
	
}
/*
정답 :

i : 11 (증감연산자로 늘어났기 때문)
n : 0 (i가 늘어나기 전에 계산했기 때문)
*/
