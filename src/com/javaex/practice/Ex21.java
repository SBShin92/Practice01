package com.javaex.practice;

/*
 * [Ex21.java]
아래의 출력 결과를 예상하여 작성하고, Ex20 문제와 어떤 부분이 다른지 비교해 보세요.
(코드를 작성해서 예상과 맞는지 확인해 보세요.)

 */
public class Ex21 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);
	}
	
}
/*
정답 :

i : 11 (증감연산자로 늘어났기 때문)
n : 1 (증감연산자로 늘어난 상태로 나머지를 구했기 때문)

전위연산 후위연산의 차이

*/