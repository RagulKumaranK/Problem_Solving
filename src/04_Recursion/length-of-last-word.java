package Recursion;
class Solution {
    public static int lengthOfLastWord(String s) {
        // my own solution.
        String[] S = s.split(" ");
        int size =S[S.length-1].length();
        return size;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hi i am ragul kumaran K i am from Coimbatore"));
    }
}