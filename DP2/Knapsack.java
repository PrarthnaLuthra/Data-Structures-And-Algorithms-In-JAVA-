package DP2;

public class Knapsack {
    
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        //Your code goes here
        return knapsack(weights,values,n,maxWeight,0);

    }
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight , int i) {
        //Your code goes here
        if(i==weights.length||maxWeight==0){
            return 0;
        }
        if(weights[i]>maxWeight){
            return knapsack(weights,values,n,maxWeight,i+1); 
        }
        else{
            int op1 = values[i]+knapsack(weights,values,n,maxWeight-weights[i],i+1); 
            int op2 = knapsack(weights,values,n,maxWeight,i+1); 
            return Math.max(op1,op2);

        }
        


    }
}



