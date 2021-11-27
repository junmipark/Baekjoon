package Day5_array;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of subject: ");
        int n = sc.nextInt();

        double[] score = new double[n]; //과목의 갯수만큼
        double max = score[0];
        //최고 점수
        for(int i=0; i<n; i++) {
            System.out.println("score: ");
            score[i] =sc.nextInt();
            if(score[i]>=max){
                max = score[i];
            }
        }
        //평균
        double sum = 0;
        for(int i=0; i<n; i++){
            //모든 점수를 점수/M*100으로
            score[i] = score[i]/max*100;
            sum += score[i];
        }
        System.out.println(sum/n);
    }
}
