class Solution {

    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        int count=0;

       Arrays.fill(dp,-1);
        int[] ans=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            ans[i]=get_ones(i,dp,count);
        }
        return ans;
    }

     private static int get_ones(int i , int[] dp , int count) {

        if(i==0) return dp[i]=count;

        if(i%2==1) {
            dp[i] = get_ones(i / 2, dp, ++count);
        }
        else dp[i] = get_ones(i/2, dp, count);
        
        return dp[i];
    }

    
}