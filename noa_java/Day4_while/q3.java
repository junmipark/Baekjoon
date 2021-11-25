package Day4_while;

import java.util.Scanner;
//몰라서 구글링으로 풀었습니다. 해설을 덧붙입니다.
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int x=n; // 사이클 후 숫자

        while(true){
            x=(((x%10)*10)+((x/10)+(x%10))%10);
            count++;

            if(n==x) break;
        }
        System.out.println(count);
    }
}
// 26에서 2는 26/10으로 나온다(몫)
// 26에서 6은 26%10으로 나온다(나머지)
// 2+6=8은 ((26/10)+(26%10))%10으로 나온다(몫+나머지를 또 나눈 나머지)
// 사이클이 돈 후 새로운 숫자 68은
//  ( (26%10)*10) + ((26/10)+(26%10))%10 ) 로 나옴
