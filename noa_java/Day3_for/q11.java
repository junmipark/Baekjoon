package Day3_for;

import java.util.Scanner;
//이건 뭐 전혀 모르겠음.
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("x:");
        int x = sc.nextInt();
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(a[i]<x){
                System.out.println(a[i]);
            }
        }
    }
}
