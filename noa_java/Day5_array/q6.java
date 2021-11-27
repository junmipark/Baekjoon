package Day5_array;

import java.util.Scanner;

// ox퀴즈 이건 더 모르겠다???
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //test case의 갯수 입력
        System.out.println("n : ");
        int n = sc.nextInt();
        //각 방에 하나씩 들어간다 쳐
        String[] arr = new String[n];

        //배열에 저장
        for(int i=0; i<n; i++){
            System.out.println("o/x : ");
            arr[i] = sc.next();
        }

        //하나씩 검사
        //방 갯수만큼
        for(int i=0; i<n; i++){
            int count = 0;
            int sum = 0;

            //한 방의 길이만큼 검사
            for(int j=0; j<arr[i].length(); j++){
                //ox quiz
                if(arr[i].charAt(j) == 'o'){
                    count++;
                }else{
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
