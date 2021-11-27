package Day5_array;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("c(test case):");
        int c = sc.nextInt();
        for(int i=0; i<c; i++){
            double sum = 0;

            System.out.println("n(학생수):");
            int n = sc.nextInt();
            int[] score = new int[n]; //학생 수만큼 방 만들어 점수 넣자
            for(int j=0;j<n;j++){
                System.out.println("score:");
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (sum/n);
            double count = 0;

            //평균 넘는 비율 계산
            for(int k=0; k<n; k++){
                if(score[k]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
