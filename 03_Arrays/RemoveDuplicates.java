/*
================================================================================
PROBLEM STATEMENT:
================================================================================
Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates IN-PLACE such that each 
element appears only once and returns the new length.

Do not allocate extra space for another array - you must modify the input 
array in-place with O(1) extra memory.

Example 1:
Input: nums = [1,1,2]
Output: 2
Explanation: Your function should return length = 2, with the first two 
elements of nums being 1 and 2. It doesn't matter what you leave beyond 
the returned length.

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5
Explanation: Your function should return length = 5, with the first five 
elements of nums being 0, 1, 2, 3, and 4.

================================================================================
APPROACH:
================================================================================
Two-Pointer Technique:
- Since the array is SORTED, all duplicates are adjacent to each other
- Use a "writePos" pointer to track where to place the next unique element
- Use a loop pointer "i" to scan through the array
- When we find a unique element (different from previous), write it at writePos
- Skip duplicates by not incrementing writePos when element is same as previous

================================================================================
STEP-BY-STEP WALKTHROUGH:
================================================================================
Example: nums = [0,0,1,1,1,2,2,3,3,4]

Initial state:
nums = [0,0,1,1,1,2,2,3,3,4]
        ^
        writePos=1

i=1: nums[1]=0 == nums[0]=0 → duplicate, skip
     nums = [0,0,1,1,1,2,2,3,3,4], writePos=1

i=2: nums[2]=1 != nums[1]=0 → unique! Write at writePos
     nums = [0,1,1,1,1,2,2,3,3,4], writePos=2
              ^

i=3: nums[3]=1 == nums[2]=1 → duplicate, skip
     nums = [0,1,1,1,1,2,2,3,3,4], writePos=2

i=4: nums[4]=1 == nums[3]=1 → duplicate, skip
     nums = [0,1,1,1,1,2,2,3,3,4], writePos=2

i=5: nums[5]=2 != nums[4]=1 → unique! Write at writePos
     nums = [0,1,2,1,1,2,2,3,3,4], writePos=3
                ^

i=6: nums[6]=2 == nums[5]=2 → duplicate, skip
     nums = [0,1,2,1,1,2,2,3,3,4], writePos=3

i=7: nums[7]=3 != nums[6]=2 → unique! Write at writePos
     nums = [0,1,2,3,1,2,2,3,3,4], writePos=4
                  ^

i=8: nums[8]=3 == nums[7]=3 → duplicate, skip
     nums = [0,1,2,3,1,2,2,3,3,4], writePos=4

i=9: nums[9]=4 != nums[8]=3 → unique! Write at writePos
     nums = [0,1,2,3,4,2,2,3,3,4], writePos=5
                    ^

Final result: First 5 elements are unique [0,1,2,3,4], return 5

================================================================================
TIME COMPLEXITY (TC):
================================================================================
O(n) where n is the length of the array
- We iterate through the array exactly once with a single for loop
- Each iteration does constant time O(1) operations (comparison and assignment)
- Therefore, total time is O(n)

================================================================================
SPACE COMPLEXITY (SC):
================================================================================
O(1) - Constant extra space
- We only use two integer variables: writePos and i
- No additional data structures are created
- We modify the array in-place
- Space used does not grow with input size

================================================================================
KEY CONCEPTS:
================================================================================
1. TWO-POINTER TECHNIQUE: One pointer (i) reads, another (writePos) writes
2. IN-PLACE MODIFICATION: We modify the original array without extra space
3. SORTED ARRAY PROPERTY: Duplicates are adjacent, so we only need to compare
   with the previous element, not all previous elements
4. SKIP DUPLICATES: By only incrementing writePos for unique elements, we
   automatically overwrite duplicates with unique values

Why this works:
- The array is sorted, so all duplicates are together
- We compare each element with its previous neighbor
- If different, it's the first occurrence of a new value → keep it
- If same, it's a duplicate → skip it (don't increment writePos)
- writePos always points to the position where the next unique element should go

================================================================================
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        // EDGE CASE: If array is empty, there are 0 unique elements
        // This prevents index out of bounds errors in the loop below
        if (nums.length == 0) return 0;
        
        // INITIALIZATION: writePos tracks where to write the next unique element
        // Start at index 1 because the first element (index 0) is always unique
        // and should stay in place
        int writePos = 1;
        
        // MAIN LOOP: Start from index 1 and scan through the entire array
        // We compare each element with the previous one to detect uniqueness
        for (int i = 1; i < nums.length; i++) {
            
            // UNIQUENESS CHECK: Compare current element with previous element
            // Since array is sorted, if nums[i] != nums[i-1], then nums[i] is
            // the first occurrence of a new unique value
            if (nums[i] != nums[i - 1]) {
                
                // WRITE UNIQUE ELEMENT: Place the unique element at writePos
                // This overwrites any duplicate values that were skipped
                nums[writePos] = nums[i];
                
                // ADVANCE WRITE POSITION: Move writePos forward to prepare for
                // the next unique element. We only increment when we find unique
                // elements, which is why duplicates get "skipped over"
                writePos++;
            }
            // IMPLICIT ELSE: If nums[i] == nums[i-1], it's a duplicate
            // We do nothing - just continue to the next iteration
            // This effectively "skips" the duplicate without incrementing writePos
        }
        
        // RETURN RESULT: writePos now equals the count of unique elements
        // It also represents the length of the "cleaned" array portion
        // Example: if writePos=5, then nums[0..4] contains all unique elements
        return writePos;
    }
    
    /*
    ============================================================================
    MAIN FUNCTION - TEST CASES
    ============================================================================
    */
    public static void main(String[] args) {
        // Create Solution object to call the method
        Solution solution = new Solution();
        
        // TEST CASE 1: Array with some duplicates
        int[] nums1 = {1, 1, 2};
        int result1 = solution.removeDuplicates(nums1);
        System.out.print("Test Case 1: " + result1 + " (Array: ");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + (i < result1 - 1 ? ", " : ""));
        }
        System.out.println(")");
        
        // TEST CASE 2: Array with many duplicates
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = solution.removeDuplicates(nums2);
        System.out.print("Test Case 2: " + result2 + " (Array: ");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + (i < result2 - 1 ? ", " : ""));
        }
        System.out.println(")");
        
        // TEST CASE 3: Array with all unique elements
        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = solution.removeDuplicates(nums3);
        System.out.print("Test Case 3: " + result3 + " (Array: ");
        for (int i = 0; i < result3; i++) {
            System.out.print(nums3[i] + (i < result3 - 1 ? ", " : ""));
        }
        System.out.println(")");
    }
}

/*
================================================================================
EXPECTED OUTPUT:
================================================================================
Test Case 1: 2 (Array: 1, 2)
Test Case 2: 5 (Array: 0, 1, 2, 3, 4)
Test Case 3: 5 (Array: 1, 2, 3, 4, 5)

================================================================================
*/