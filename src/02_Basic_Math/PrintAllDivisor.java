package Striver.BasicMath;
import java.util.*;
public class PrintAllDivisor {
        public static void main(String[] args) {
        divisor(36);
        divisors_Optimal(36);
    }
    
    static void divisor(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        arr.add(n);
        System.out.println(arr);
    }

    // optimal Solution
     public static void divisors_Optimal(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        for(int a : set){
            System.out.print(a+" ");
        }
    }
}
