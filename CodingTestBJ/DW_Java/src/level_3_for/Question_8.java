package level_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//문제
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		//입력
		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.

		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		//출력
		//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+ a+" + "+b+" = "+(a+b)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
				
		// 아무리해도 a와 b의 값에 입력받은 문자열값을 인트타입으로 파싱해서 넣어줘야할지 감이 안잡혔는데 굳이 그럴필요 없이
		// 스트링토크나이저에 br.readline으로 각각 분리해서 입력받은 값을 st.nextToken를 이용하여 그대로 다시
		// a와 b에 파싱해서 넣어주면 되는 거였다...출처는 동일하게 https://st-lab.tistory.com/34
		// int a랑 int b에 값 대입하는거 빼곤 다 내 머리속에서 정리해서 출처글과 비슷하게 풀렸는데 ㅠㅠ...아쉬웠다
	}

}
