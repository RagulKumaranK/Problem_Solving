package Leetcode;
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] nums1 = {0, 1, 1, 0};
        int[] result1 = solution.getSneakyNumbers(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + java.util.Arrays.toString(nums1));
        System.out.println("Output: " + java.util.Arrays.toString(result1));
        System.out.println();
        
        // Test Case 2
        int[] nums2 = {0, 3, 2, 1, 3, 2};
        int[] result2 = solution.getSneakyNumbers(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + java.util.Arrays.toString(nums2));
        System.out.println("Output: " + java.util.Arrays.toString(result2));
        System.out.println();
        
        // Test Case 3
        int[] nums3 = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        int[] result3 = solution.getSneakyNumbers(nums3);
        System.out.println("Test Case 3:");
        System.out.println("Input: " + java.util.Arrays.toString(nums3));
        System.out.println("Output: " + java.util.Arrays.toString(result3));
        System.out.println();
        
        // Test Case 4 - Small array
        int[] nums4 = {1, 1, 0};
        int[] result4 = solution.getSneakyNumbers(nums4);
        System.out.println("Test Case 4:");
        System.out.println("Input: " + java.util.Arrays.toString(nums4));
        System.out.println("Output: " + java.util.Arrays.toString(result4));
    }
}

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length-2;
        int[] count = new int[n];
        int[] dup = new int[2];
        int m =0;
        for(int num : nums){
            count[num]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==2){
                dup[m++]=count[i];
            }
        }
        return dup;
    }
}