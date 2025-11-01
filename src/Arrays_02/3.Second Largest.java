package src.Arrays_02;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Test Case 1: " + solution.getSecondLargest(arr1));
        
        // Test Case 2
        int[] arr2 = {10, 10, 10};
        System.out.println("Test Case 2: " + solution.getSecondLargest(arr2));
        
        // Test Case 3
        int[] arr3 = {10, 5, 10};
        System.out.println("Test Case 3: " + solution.getSecondLargest(arr3));
    }

/*  Brute force approach: Sort the array and find the second largest element

    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int second = -1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] != arr[n-1]){
                second = arr[i];
                break;
            }
        }
        return second;
       } */
      
       public int getSecondLargest(int[] arr) {
        int first =-1;
        int second = -1;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            } else if(num > second && num != first){
                second = num;
            }
        }
        return second;
    }
}