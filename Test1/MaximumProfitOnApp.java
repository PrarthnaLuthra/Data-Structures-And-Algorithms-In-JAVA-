package Test1;
import java.util.*;
public class MaximumProfitOnApp {
    
	public static int maximumProfit(int budget[]) {
		// Write your code here
        
        Arrays.sort(budget);
        int n =  budget.length;
        int ans = Integer.MIN_VALUE;
        for(int i =0; i<budget.length;i++){
            int m = n-i;
            if(m*budget[i]>ans){
                ans =m*budget[i];
            }
        
        }
        return ans;
        

	}

}

