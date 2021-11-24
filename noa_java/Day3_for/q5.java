package Day3_for;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int N = sc.nextInt();
        if(N<=100000){
            for(int i=1;i<=N;i++){
                System.out.println(i);
            }
        }
    }
}
