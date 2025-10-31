package Striver.BasicMath;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println(primeornot(97));
    }
    /* 
    static boolean primeornot(int n){

        int count =0;
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                count++;
                if(n/i !=i) count++;
            }
        }
        if(count==2) return true;
        return false;
    }
        */
    static boolean primeornot(int n){
        if(n<=0) return false;
        if(n<=3) return true;
        if(n%2 ==0 || n%3==0) return false;
        for(int i =5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
    }
    return true;
}
}
