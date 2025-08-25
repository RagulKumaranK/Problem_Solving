package BasicProblems;

public class GCD_HCF {
    public static void main(String[] args) {
        // for 2 numbers
        System.out.println(gcdHcfCal(81, 9));
        //for 3 numbers
        System.out.println(gcdHcfCal(gcdHcfCal(81, 9),27));
    }
    static int gcdHcfCal(int x,int y){
        while(x>0&&y>0){
        if(x>y) x=x%y;
        else y=y%x;
        }
        if(x==0) return y;
        return x;
    }
}
