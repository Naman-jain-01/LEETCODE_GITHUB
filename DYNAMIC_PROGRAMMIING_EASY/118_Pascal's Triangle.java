
class Solution {
    public List<List<Integer>> generate(int numRows) {


        int[][] dp=new int[numRows+1][numRows+1];

        for (int i = 0; i < numRows; i++) {
            Arrays.fill(dp[i],-1);
        }


        List<List<Integer>> ans =new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                ans.get(i).add(pascalTriangle(i,j,dp));
            }
        }
        return ans;
    }

     public static int pascalTriangle(int i, int j,int[][] dp) {
       
       if(dp[i][j]!=-1) return dp[i][j];

               if (i == 0 || j == i || j == 0) {
            return 1;
        }
        return dp[i][j]= pascalTriangle(i - 1, j,dp) + pascalTriangle(i - 1, j - 1,dp);
    }

}