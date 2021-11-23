package Day2;

import java.util.Scanner;

//45분 전 시간 구하기
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("H:");
        int H = sc.nextInt();
        System.out.println("M:");
        int M = sc.nextInt();

        if(M<45){
            H--;
            M = 60 - (45-M);
            if(H<0){
                H=23;
            }
            System.out.println(H+" "+M);
        }else{
            System.out.println(H+" "+(M-45));
        }
    }
}
