package Day3_for;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("T:");
        int T = sc.nextInt();
        for(int i=1; i<=T; i++){
            System.out.println("A:");
            int A = sc.nextInt();
            System.out.println("B:");
            int B = sc.nextInt();
            System.out.println("Case #"+i+": "+A+"+"+B+" = "+(A+B));
        }
    }
}
