package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix { 
    public static void main(String[] args) {
        String[] str1 = {"ragul","rag","ragg","raguu"};
        System.out.print(Prefix(str1));
    }
    static String Prefix(String[] str){
        if(str.length==1) return str[0];
        Arrays.sort(str);
        String result = "";
        for(int i=0;i<str[0].length();i++){
            if(str[0].charAt(i)!=str[str.length-1].charAt(i)) return result;
            else{
                result+=str[0].charAt(i);
            }
        }
        return result;

    }
    
}
