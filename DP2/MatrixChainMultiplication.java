package DP2;

public class MatrixChainMultiplication {
    
	
	public static int mcm(int[] p){
		
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
    
        int storage[][] = new int[p.length][p.length]; 
            for(int i= p.length-2; i>= 1; i--){
                for(int j =1; j<=p.length-1; j++){ 
                    if(i < j ){ 
                        int minCost = Integer.MAX_VALUE;
                        for(int k = i; k < j; k++){ 
                            int cost = storage[i][k] + storage[k+1][j] + p[i-1]*p[k]*p[j]; 
                            if(cost < minCost){ 
                                minCost = cost;
                            } 
                            storage[i][j] = minCost; 
                        }
                    }
                } 
            }
            return storage[1][p.length-1]; 
        }
    }
