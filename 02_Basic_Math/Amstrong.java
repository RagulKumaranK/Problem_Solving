package Striver.BasicMath;

public class Amstrong {
    public static void main(String[] args) {
        System.out.println(amstrongs(54748));
    }
    
    static boolean amstrongs(int n){
        int m,x;
        m = x =n;
        int count=0;
        while(m>0){
            count ++;
            m/=10;
        }
        int sum =0;
        int temps=1;
        while(x>0){
            int last = x%10;
            for(int i=count;i>0;i--){
                temps = temps*last;
            }
            sum+=temps;
            temps=1;
            x/=10;
        }
        System.out.println(sum);
        if(sum==n) return true;
        return false;
    }
}
