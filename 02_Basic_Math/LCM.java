package BasicProblems;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmProblem1(12,36));
        System.out.println(lcmProblem2(12,36));
    }
    static int lcmProblem1(int x,int y){
        int max = Math.max(x, y);
        while(true){
            if(max%x==0&&max%y==0){
                return max;
            }
            max++;
        }
    }
    static int lcmProblem2(int x,int y){
        return (x*y)/(GCD_HCF.gcdHcfCal(x, y));
    }
}

