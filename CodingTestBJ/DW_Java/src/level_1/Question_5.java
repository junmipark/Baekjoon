package level_1;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		//첫째 줄에 A+B를 출력한다.
		//ex) 1 2
		//		3
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		
		//스캐너를 사용하여 입력을 받고 사칙연산을 통해 a와 b를 더한 값을 '출력'하는 문제였다.
		//스캐너 말고도 버퍼드 리더(BufferdReader)를 사용해도 되지만 지금까지 계속 스캐너를 사용해왔어서 그런지 버퍼드리더는
		//손에 익지 않아 손에 익고 간단한 스캐너를 사용해 문제를 풀었다.
		//기능적, 속도적인 면에서는 스캐너보단 버퍼드리더가 훨씬 좋다고들 한다..
	}

}
