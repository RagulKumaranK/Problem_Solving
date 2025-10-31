package leetcode;

public class ScoreofString {
    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.charAt(i)+" "+s.charAt(i+1));
            int temp = s.charAt(i) - s.charAt(i + 1);
            System.out.println(temp);
            sum += temp;
        }
        return sum;
    }

    // Main method to test the above function
    public static void main(String[] args) {
        String input = "hello";  // You can change this input to test other strings
        int result = scoreOfString(input);
        System.out.println("Score of string \"" + input + "\" is: " + result);
    }
}

