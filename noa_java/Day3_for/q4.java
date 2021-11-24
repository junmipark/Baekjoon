package Day3_for;

import java.io.*;

public class q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());
        for(int i=0; i<T; i++){
            String input = br.readLine();
            String[] number = input.split(" ");
            int A = Integer.parseInt(number[0]);
            int B = Integer.parseInt(number[1]);
            bw.write((A+B)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
