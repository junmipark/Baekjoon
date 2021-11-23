package level_1;

import java.util.Scanner;

public class Question_10 {
	public static void main(String[] args) {
		/*
		 *  (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

			(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
			
			세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
			
			첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
			첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
			
			ex) 5 8 4
			1
			1
			0
			0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println( (a+b)%c );
		System.out.println( (a%c + b%c)%c );
		System.out.println( (a*b)%c );
		System.out.println( (a%c * b%c)%c );
		
		// 처음엔 문제를 이해를 못해서 여러번 시도를 해봤으나 계속 오답 또는 컴파일 에러였다.
		// 예제의 입력값 5 8 4 가 입력이 되었을때 나오는 값이 1 1 0 0이라는 문제고
		// 친절하게 양식까지 다 있었음에도 왜 오답을 적었는지 이해가 안가지만
		// 문제를 너무 난해하게 생각했던 것 같다. 문제에 정답이 있었다. 풀이는 딱히 없다
	}
}
