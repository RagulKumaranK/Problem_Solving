package BasicProblems;

public class perfectNumberCheck {
    public static void main(String[] args) {
        System.out.println(perfectNumberCheckProblem(12));
    }
    static boolean perfectNumberCheckProblem(int x){
        int sum=1;
        for(int i =2;i<=x/2;i++){
            if(x%i==0){
                sum+=i;
                if(i!=x/i){
                    sum+=x/i;
                }
            }
        }
        if(sum==x) return true;

        return false;

    }
}
