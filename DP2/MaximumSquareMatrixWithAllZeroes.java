package DP2;

public class MaximumSquareMatrixWithAllZeroes {
    
    public static int findMaxSquareWithAllZeros(int[][] input){

        /* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        //            int m=input.length;
        //      if (m==0)
        //          return 0;

        //      int n=input[0].length;
        //      if (n==0)
        //          return 0;

        //      int[][] dp = new int[m][n];
        //      int maxVal=0;

        //      for (int i=0;i<n;i++)
        //      {
        //          if (input[0][i]==0)
        //          {
        //              dp[0][i]=1;
        //          }
        //      }

        //      for (int i=0;i<m;i++)
        //      {
        //          if (input[i][0]==0)
        //          {
        //              dp[i][0]=1;
        //          }
        //      }

        //      for (int i=1;i<m;i++)
        //      {
        //          for (int j=1;j<n;j++)
        //          {
        //              if(input[i][j]==0)
        //              {
        //                  int ans1=dp[i-1][j];
        //                  int ans2=dp[i][j-1];
        //                  int ans3=dp[i-1][j-1];

        //                  dp[i][j]=Math.min(ans1,Math.min(ans2,ans3))+1;
        //              }
        //              if (dp[i][j]>maxVal)
        //              	maxVal=dp[i][j];
        //          }

        //      }

        //      return maxVal;

        // 	}
        // }
        int m = input.length;
        if(m==0){
            return 0;
        }
        int n = input[0].length;
           if(n==0){
            return 0;
        }
        
        int storage[][]=new int [m][n];
        for(int i = 0; i<n;i++){
            if(input[0][i] == 0){
                storage[0][i] = 1;
            }else{
                storage[0][i] = 0;
            }
        }
        for(int j = 0; j<m;j++){
            if(input[j][0] == 0){
                storage[j][0] = 1;
            }else{
                storage[j][0] = 0;
            }
        }
        for(int i =1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(input[i][j]!=0){
                    storage[i][j]=0;
                }else{
                    storage[i][j] = 1 + Math.min(storage[i-1][j-1] ,Math.min(storage[i][j-1],storage[i-1][j]));
                }
            }
        }
        int max =0;
        for(int i =1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(storage[i][j]>max){
                    max=storage[i][j];
                }

            }
        }
        return max;



    }


}
