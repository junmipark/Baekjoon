package level_1;

import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) {
		/*
		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		첫째 줄에 A×B를 출력한다.
		ex) 1 2
			2
			3 4
			12
		*/
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
		
		//5번 6번 문제와 동일.
	}
}
