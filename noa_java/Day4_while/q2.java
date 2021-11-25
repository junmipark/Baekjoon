package Day4_while;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            System.out.println("a:");
            int a=sc.nextInt();
            System.out.println("b:");
            int b=sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
