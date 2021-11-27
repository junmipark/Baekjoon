package Day5_array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// omg Map ?????
// 서로 다른 값이 몇 개인지 묻는 문제이므로 중복 제거하고 저장
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<Integer>();

        //배열의 나머지를 저장
        for(int i=0; i<10; i++) {
            System.out.println("n:");
            int n = sc.nextInt();
            if(n<=1000) {
                s.add(n % 42);
            }
        }
        System.out.println(s.size());
    }
}
