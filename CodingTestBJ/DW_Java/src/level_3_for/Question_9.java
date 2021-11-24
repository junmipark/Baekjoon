package level_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		문제
		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		입력
		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

		출력
		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 보통의 별찍기는 0부터 시작해서 조건식을 <로 해서 그 값까지 표현하는데 문제는 5를 입력했을때 5줄의 행과 별이 찍혀야되기 때문에 i를 1로 시작하고 j도 1로 시작했다
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
