class Solution {
    static public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

       return fib_recursion(n,dp);
    }
    static public int fib_recursion(int n,int[] dp) {

        if(dp[n]!=-1) return dp[n];

        if(n==0) return 0;
        if(n==1) return 1;
        return dp[n]=fib_recursion(n-1,dp)+fib_recursion(n-2,dp);
    }
}