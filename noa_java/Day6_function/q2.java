package Day6_function;

public class q2 {
    //2.
    public static void main(String[] args) {

    }
    // 1.
    public static int d(int x){
        int result = x;
        while(true){
            if(x==0){
                break;
            }
            result += x%10; //자릿수의 값 더하기
            x = x/10;
        }
        return result;
    }
}
