package Day3_for;

import java.io.*;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) throws IOException {
        //q7.test01();
        q7.test02();
        // test01()로 안 돼서 test02()로 함.
    }
    public static void test01() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(r.readLine().trim());
        for(int i=1; i<=T; i++){
            String input = r.readLine();
            String[] n = input.split(" ");
            int A = Integer.parseInt(n[0]);
            int B = Integer.parseInt(n[1]);
            w.write("Case #"+i+": "+(A+B));
        }
        w.flush();
        w.close();
    }
    public static void test02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("T:");
        int T = sc.nextInt();
        for(int i=1; i<=T; i++){
            System.out.println("A:");
            int A = sc.nextInt();
            System.out.println("B:");
            int B = sc.nextInt();
            System.out.println("Case #"+i+": "+(A+B));
        }

    }
}
