package DP2;

public class MinimumCostPath {
    
    public static int minCostPath(int[][] input) {
        //Your code goes here
        return minCostPath(input,0,0);


    }
    public static int minCostPath(int[][] input,int i, int j) {
        //Your code goes here
        int m = input.length;
        int n = input[0].length;

        if(i==m-1 && j==n-1)
        {
            return input[i][j];
        }

        if(i>=m || j>=n)
        {
            return Integer.MAX_VALUE;
        }
        int min1=minCostPath(input,i+1,j+1);
        int min2=minCostPath(input,i+1,j);
        int min3=minCostPath(input,i,j+1);
        return input[i][j]+ Math.min(min1,Math.min(min2,min3));

        }
}
