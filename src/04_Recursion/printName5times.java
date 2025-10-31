package Striver.Recursion;

public class printName5times {
    static String a = "Ragul";
    public static void main(String[] args) {
        Recursion(5);
    }
    static void Recursion(int n){
        
        if(n==0) return ;
        else{
            System.out.println(a);
            Recursion(n-1);
        }
    }
}
