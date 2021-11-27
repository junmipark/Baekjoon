package Day5_array;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();
        int abc = a*b*c;
        String abcString = Integer.toString(abc); //String으로 변경
        //String으로 변경한 abcString의 길이만큼 배열에 한 글자씩(한 숫자씩) 담기
        char[] arr = new char[abcString.length()];
        for(int i=0; i<abcString.length(); i++){
            arr[i] = abcString.charAt(i);
        }
        //count
        for(int i=0; i<=9; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]-'0'==i){ // 이거 뭔지 잘 모르겠음
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
