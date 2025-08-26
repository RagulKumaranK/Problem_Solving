package Recursion;

public class factorialofNumber {
    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }
    public static int factorialNumber(int n){
        if(n==1) return 1;
        return n*factorialNumber(n-1);
    }
}
