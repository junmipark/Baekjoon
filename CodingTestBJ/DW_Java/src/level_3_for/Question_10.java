package level_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		문제
		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

		입력
		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

		출력
		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		*/
		
		
		//개행을 어떤식으로 처리해야할지 몰라서 구글링을 통해 풀이를 봤다..
		//방법은 이중포문이 아닌 삼중포문(?)이라고 해야하나..? 여튼 포문안에 두개의 포문을 두는거였다.
		//각 코드마다 풀이를 적어보겠다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //얼마나 반복할지에 대한 값을 입력받는다
		
		for(int i=1; i<=n; i++) { // 문제의 예시처럼 5를 입력받으면 5줄(5행)을 입력받아야 되기 때문에 1부터 시작하고 조건식을 <=n 으로 해서 입력받은 값만큼 반복한다
			for(int j=1; j<=n-i; j++) { // 공백을 담당할 내부 반복문이다. 조건문으로 반복할 값 -i를 통해 공백은 반드시 입력값보다 작게, 1씩줄어들게 설정한다. i는 1씩 증가하니까..
				bw.write(" ");			//ex) 3을 입력하면 첫째줄 공백은 2, 둘째줄 공백은 1, 셋째줄은 공백이 없다.
			}
			for(int k=1; k<=i; k++) { //별을 찍어줄 내부 반복문이다. 반복할 값은 1부터 입력받은 값만큼 증가하는 i로 했다. 그래야 1개, 2개, 3개 이런식으로 한개씩 찍힐테니
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
