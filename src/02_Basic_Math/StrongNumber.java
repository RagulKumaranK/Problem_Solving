package BasicProblems;

/*
Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. 
Given a number N, the task is to check if it is a Strong Number or not. 
Print 1 if the Number is Strong, else Print 0.

Example 1:

Input:
N = 145
Output: 1
Explanation:
1! + 4! + 5! = 145 So, 145 is a Strong
Number and therefore the Output 1. else 0 
 */

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(strongNumber(123));
         System.out.println(isStrong(123));
    }
    static int strongNumber(int n){
        int check=n;
        int temp=0;
        while(n>0){
            int last = n%10;
            temp+=Recursion.factorialofNumber.factorialNumber(last);
            n/=10;
        }
        if(check==temp) return 1;
        return 0;
    }
    //the digit is 0 to 9 right ?
    static int isStrong(int N) {
        if(N<0) return 0;
        int m=N;
        int sum =0;
        int fac[] ={1,1,2,6,24,120,720,5040,40320,362880};
        while(N>0){
            sum+=fac[N%10];
            N/=10;
        }
        if(sum==m) return 1;
        return 0;
        
    }
}
