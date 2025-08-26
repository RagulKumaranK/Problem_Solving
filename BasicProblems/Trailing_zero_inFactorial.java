package BasicProblems;

public class Trailing_zero_inFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZero(100));
    }
    static int trailingZero(int n){
        int count =0;
        /*while(n>=5){
            count = count + n/5;
            n=n/5;
        }*/

         for(int i =5;i<=n;i=i*5){
            count +=n/i;
        }
        return count;
    }
}
