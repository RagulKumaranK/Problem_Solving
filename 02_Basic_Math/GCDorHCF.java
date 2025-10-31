package Striver.BasicMath;

public class GCDorHCF {
    public static void main(String[] args) {
        GCD(130,13);
    }
    static void GCD(int a , int b){
        while(a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) System.out.println(b);
        else System.out.println(a);
    }
}
