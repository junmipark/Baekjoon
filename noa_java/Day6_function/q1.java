package Day6_function;

public class q1 {
    public long sum(int[] a) {
        long sum = 0;
        for(int n=0; n<a.length; n++){
            sum += a[n];
        }
        return sum;
    }
}
