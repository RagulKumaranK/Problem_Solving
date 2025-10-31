package Striver.Recursion;
class FibonacciSolution {
    
    // Method 1: Brute Force - Recursive (O(2^n) time, O(n) space)
    public int fibBruteForce(int n) {
        if(n <= 1) return n;
        return fibBruteForce(n-1) + fibBruteForce(n-2);
    }
    
    // Method 2: Your Optimal - Iterative Space Optimized (O(n) time, O(1) space)
    public int fibOptimal(int n) {
        if(n <= 1) return n;
        int first = 0;
        int second = 1;
        for(int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
    
    
    // Main method for testing
    public static void main(String[] args) {
        FibonacciSolution solution = new FibonacciSolution();
        int[] testCases = {0, 1, 5, 10, 20, 35};
        
        System.out.println("=== FIBONACCI SOLUTIONS COMPARISON ===\n");
        
        for(int n : testCases) {
            System.out.println("n = " + n);
            
            // Test all methods
            long start, end;
            
            // Brute Force (skip for large n to avoid timeout)
            if(n <= 35) {
                start = System.nanoTime();
                int brutResult = solution.fibBruteForce(n);
                end = System.nanoTime();
                System.out.printf("Brute Force:        %d (Time: %.2f ms)\n", 
                                brutResult, (end-start)/1_000_000.0);
            } else {
                System.out.println("Brute Force:        SKIPPED (too slow for large n)");
            }
            
            // Your Optimal Solution
            start = System.nanoTime();
            int optimalResult = solution.fibOptimal(n);
            end = System.nanoTime();
            System.out.printf("Your Optimal:       %d (Time: %.2f ms)\n", 
                            optimalResult, (end-start)/1_000_000.0);
            
          
        
        // Complexity Analysis
        System.out.println("\n=== COMPLEXITY ANALYSIS ===");
        System.out.println("┌──────────────────────┬──────────────┬───────────────┐");
        System.out.println("│ Method               │ Time         │ Space         │");
        System.out.println("├──────────────────────┼──────────────┼───────────────┤");
        System.out.println("│ Brute Force          │ O(2^n)       │ O(n)          │");
        System.out.println("│ Your Optimal         │ O(n)         │ O(1)          │");
        System.out.println("└──────────────────────┴──────────────┴───────────────┘");
        
        // Interview Tips
        System.out.println("\n=== INTERVIEW STRATEGY ===");
        System.out.println("1. Start with Brute Force (recursive)");
        System.out.println("2. Identify overlapping subproblems");
        System.out.println("3. Add memoization for O(n) time");
        System.out.println("4. Convert to bottom-up DP");
        System.out.println("5. Optimize space to O(1) (your solution!)");
        System.out.println("6. Mention O(log n) matrix solution for bonus points");
    }
}
}