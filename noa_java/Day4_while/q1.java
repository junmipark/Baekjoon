package Day4_while;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("a:");
            int a = sc.nextInt();
            System.out.println("b:");
            int b = sc.nextInt();
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }
    }
}
