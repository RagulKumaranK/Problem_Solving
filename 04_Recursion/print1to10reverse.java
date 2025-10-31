package Striver.Recursion;
public class print1to10reverse{
    public static void main(String[] args) {
        reverse(1);
    }
    static void reverse(int n){
        if(n==10) System.out.println(10);
        else{
        reverse(n+1);
        System.out.println(n);
        }
    }
}