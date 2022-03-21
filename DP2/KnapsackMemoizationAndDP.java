package DP2;

public class KnapsackMemoizationAndDP {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */

        int dp[][]=new int[n+1][maxWeight+1];


        for(int i =1;i<n+1;i++)
        {
            for(int j=1;j<maxWeight+1;j++)
            {
                if(weight[i-1]<=j)
                {
                    int a = value[i-1]+dp[i-1][j-weight[i-1]];
                    int b = dp[i-1][j];
                    dp[i][j]=Math.max(a, b);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][maxWeight];
    }
}