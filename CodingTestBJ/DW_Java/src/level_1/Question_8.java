package level_1;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
		
		//ex) 1 3
		//	 0.33333333333333333333333333333333
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.println(a/b);
		
		//처음엔 출력값의 절대오차 또는 상대오차가 10-9 이하면 정답이라길래 이게 무슨뜻일까 고민을 많이 했는데
		//어차피 더블 타입의 변수로 나눗셈을 하게되면 출력 한계치가 있어 10-9 로 출력되기 때문에 할 필요가 없는 고민이였던 것 같다..
	}

}
