package BasicProblems;

public class reapetedSumOfDigit {
    public static void main(String[] args) {
     System.out.println(repeatedSumOfDigits(1873));   
     System.out.println(optimalSumOfDigit(1234));
    }
    static int repeatedSumOfDigits(int n) {
        if(n<=9) return n;
        int sum =0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return repeatedSumOfDigits(sum);
        }
    static int optimalSumOfDigit(int n){
        if(n==0) return 0;
        return (n%9==0)? 9:n%9;
    }
}
