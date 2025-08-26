package BasicProblems;

public class Product_Sum_of_integer {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(13));
    }
    public static int subtractProductAndSum(int n) {
        int pro =1;
        int sum =0;
        while(n>0){
            int last = n%10;
            pro*=last;
            sum+=last;
            n/=10;
        }
        return pro-sum;
        
    }
}
