package level_3_for;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=1; i<=9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        // 정수 N을 입력받고 그에 해당하는 구구단 출력하기
	}

}
