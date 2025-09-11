package BasicProblems;
/*
input number ah factorial pannitu like 100! pannitu atha oda output laa evolo
zeros irukunu solanum atha trailing zero so 100! = 100000000000000000000000000000 = 24 zeros 

epidi vathuchu? just simple:
100/5 = 20
20/5 = 4
so 24.

other method :
100/5 = 20
100/25 =4
so 24
 */
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
