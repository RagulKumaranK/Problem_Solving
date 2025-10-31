package BasicProblems;

public class perfectNumberCheck {
    public static void main(String[] args) {
        System.out.println(perfectNumberCheckProblem(28));
    }
    static boolean perfectNumberCheckProblem(int x){
        int sum=1;
        System.out.println(Math.sqrt(x));
        for(int i =2;i<=Math.sqrt(x);i++){
            
            if(x%i==0){
                sum+=i;
                if(i!= x/i){
                    sum+=x/i;
                }
            }
        }
        return x==sum;

    }
}
