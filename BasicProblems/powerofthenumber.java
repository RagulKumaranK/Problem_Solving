package BasicProblems;
//base = 5 exponent = 2 output =25
// not for 2 exponent for all.
public class powerofthenumber {
    
    public static void main(String[] args) {
        System.out.println((long)Math.abs(baseExponent(46,25)));
    }
    static int baseExponent(int base, int ex){
        //return (int)Math.pow(base, ex);
        if(ex==0) return 1;
        if(base==0) return 0;
        return helper(base,ex,1,base);
    }
    static int helper(int x, int y,int count,int result){
        if(count==y) return result;
        return helper(x,y,count+1,result*x);
    }
}

