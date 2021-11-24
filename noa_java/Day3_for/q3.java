package Day3_for;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        int num = 0;
        if(n>=1&&n<=10000){
            for(int i=0; i<=n; i++){
                num+=i;
            }
        }
        System.out.println(num);
    }
}
