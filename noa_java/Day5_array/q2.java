package Day5_array;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int[] n = new int[9]; //9개의 방 만들자
        for(int i=0; i<9; i++){
            n[i] = sc.nextInt();
        }
        int max = n[0]; //최대값은 어디에!?
        int index = 0; // 몇 번째 수냐 !
        for(int i=0; i<9; i++){
            if(n[i]>=max){
                max = n[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
