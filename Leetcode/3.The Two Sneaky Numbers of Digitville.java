package Leetcode;
/*
==================================================================================
PROBLEM STATEMENT:
==================================================================================
You are given an array 'nums' that contains n distinct numbers from 0 to n-1,
but with exactly 2 numbers appearing twice (duplicates).

Task: Find and return those 2 duplicate numbers.

Example 1:
Input: nums = [0,1,2,3,2,4,4]
Output: [2,4]
Explanation: Length is 7, so n = 7-2 = 5
             Valid range: 0 to 4
             Numbers 2 and 4 appear twice

Example 2:
Input: nums = [0,3,2,1,3,2]
Output: [2,3]
Explanation: Length is 6, so n = 6-2 = 4
             Valid range: 0 to 3
             Numbers 2 and 3 appear twice

Example 3:
Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
Output: [4,5]
Explanation: Length is 12, so n = 12-2 = 10
             Valid range: 0 to 9
             Numbers 4 and 5 appear twice
==================================================================================
*/

class Solution {
    
    /*
    APPROACH: Frequency Counting using Array
    ----------------------------------------
    Since numbers are in range [0, n-1], we can use their values as indices.
    We count frequency of each number and find which ones appear twice.
    
    WHY THIS WORKS:
    - Array length gives us upper bound
    - We know exactly 2 numbers repeat twice
    - Counting frequencies helps identify duplicates
    
    TIME COMPLEXITY: O(n)
    - First loop: O(n) - traverse entire nums array
    - Second loop: O(n-2) ≈ O(n) - traverse count array
    - Total: O(n) + O(n) = O(n) LINEAR TIME
    
    SPACE COMPLEXITY: O(n)
    - count array: O(n-2) ≈ O(n) extra space
    - dup array: O(2) = O(1) constant space
    - Total: O(n) AUXILIARY SPACE
    
    ==================================================================================
    STEP-BY-STEP WALKTHROUGH with Example: nums = [0,1,2,3,2,4,4]
    ==================================================================================
    Initial State:
    - nums = [0,1,2,3,2,4,4]
    - n = 7 - 2 = 5 (valid range: 0 to 4)
    - count = [0,0,0,0,0] (size 5)
    - dup = [0,0] (will store 2 duplicates)
    - m = 0 (index pointer for dup array)
    
    PHASE 1: Count Frequencies
    ---------------------------
    Iteration 1: num = 0 → count[0]++ → count = [1,0,0,0,0]
    Iteration 2: num = 1 → count[1]++ → count = [1,1,0,0,0]
    Iteration 3: num = 2 → count[2]++ → count = [1,1,1,0,0]
    Iteration 4: num = 3 → count[3]++ → count = [1,1,1,1,0]
    Iteration 5: num = 2 → count[2]++ → count = [1,1,2,1,0] ← First duplicate found!
    Iteration 6: num = 4 → count[4]++ → count = [1,1,2,1,1]
    Iteration 7: num = 4 → count[4]++ → count = [1,1,2,1,2] ← Second duplicate found!
    
    PHASE 2: Extract Duplicates
    ----------------------------
    Check i=0: count[0]=1 (not 2, skip)
    Check i=1: count[1]=1 (not 2, skip)
    Check i=2: count[2]=2 ✓ → dup[0]=2, m=1 → dup = [2,0]
    Check i=3: count[3]=1 (not 2, skip)
    Check i=4: count[4]=2 ✓ → dup[1]=4, m=2 → dup = [2,4]
    
    Final Result: [2,4]
    ==================================================================================
    */
    
    public int[] getSneakyNumbers(int[] nums) {
        // Calculate n: the range of valid numbers (0 to n-1)
        // If array has length L, then L = n + 2 (n distinct + 2 duplicates)
        // So n = L - 2
        int n = nums.length - 2;
        
        // Create frequency counter array for range [0, n-1]
        // count[i] will store how many times number 'i' appears
        int[] count = new int[n];
        
        // Array to store the 2 duplicate numbers we find
        int[] dup = new int[2];
        
        // Index pointer for dup array (tells us where to insert next duplicate)
        int m = 0;
        
        // PHASE 1: Count frequency of each number
        // Loop through all numbers in input array
        for(int num : nums) {
            // Increment count for this number
            // num itself acts as index (since num is in range [0, n-1])
            count[num]++;
        }
        
        // PHASE 2: Find numbers that appear exactly twice
        // Loop through the count array
        for(int i = 0; i < count.length; i++) {
            // If this number appears exactly 2 times, it's a duplicate
            if(count[i] == 2) {
                // Store the number (not the count) in result array
                dup[m++] = i;
                // Post-increment m to move to next position
            }
        }
        
        // Return array containing the 2 duplicate numbers
        return dup;
    }
    
    /*
    ==================================================================================
    MAIN FUNCTION - FOR TESTING
    ==================================================================================
    */
    public static void main(String[] args) {
        // Create Solution object to call our method
        Solution solution = new Solution();
        
        // Test Case 1: Basic example with small duplicates
        int[] test1 = {0, 1, 2, 3, 2, 4, 4};
        int[] result1 = solution.getSneakyNumbers(test1);
        System.out.println("Test Case 1: [" + result1[0] + ", " + result1[1] + "]");
        
        // Test Case 2: Duplicates at different positions
        int[] test2 = {0, 3, 2, 1, 3, 2};
        int[] result2 = solution.getSneakyNumbers(test2);
        System.out.println("Test Case 2: [" + result2[0] + ", " + result2[1] + "]");
        
        // Test Case 3: Larger array with higher duplicate values
        int[] test3 = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        int[] result3 = solution.getSneakyNumbers(test3);
        System.out.println("Test Case 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}

/*
==================================================================================
KEY CONCEPTS & WHY THIS APPROACH WORKS:
==================================================================================

1. ARRAY AS HASH MAP:
   - Since numbers are bounded (0 to n-1), we use array indices as keys
   - count[i] stores frequency of number i
   - No need for HashMap - simple array is faster and more space-efficient

2. TWO-PASS ALGORITHM:
   - Pass 1: Build frequency table
   - Pass 2: Extract duplicates
   - Clean separation of concerns

3. GUARANTEED SOLUTION:
   - Problem guarantees exactly 2 duplicates
   - No need for extra validation
   - dup array will always be filled with exactly 2 numbers

4. IN-PLACE INDEXING:
   - Number values directly map to array indices
   - No hash collisions, perfect hashing
   - O(1) access time for counting

5. TRADE-OFF:
   - Space: O(n) extra for counting array
   - Time: O(n) linear scan
   - Alternative would be sorting O(n log n) or nested loops O(n²)
   - This is optimal for the given constraints

==================================================================================
EXPECTED OUTPUT:
==================================================================================
Test Case 1: [2, 4]
Test Case 2: [2, 3]
Test Case 3: [4, 5]
==================================================================================
*/