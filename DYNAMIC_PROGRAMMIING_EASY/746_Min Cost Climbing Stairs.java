class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
         int n=cost.length;
         int[] dp=new int[n+1];
         Arrays.fill(dp,-1);
        return Math.min(recursion(cost, n-1,dp), recursion(cost, n-2,dp));

    }

    public static int recursion(int[] cost,int i,int[] dp)
    {
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=cost[i]+Math.min(recursion(cost, i-1,dp), recursion(cost, i-2,dp));
    }
}
