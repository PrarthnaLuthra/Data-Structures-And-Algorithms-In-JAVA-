package StacksAndQueues;
import java.util.*;

public class StockSpan {
    
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[]span = new int[price.length];
        Stack<Integer> temp = new Stack<>();
        span[0]=1;
         temp.push(0);
        for(int i =1; i<price.length;i++){
             while(!temp.isEmpty() && price[temp.peek()]<price[i])
            {
              temp.pop();
            }
          
            
            if (temp.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                
                span[i]=i-temp.peek();
            }
            temp.push(i);
           
        }
        return span;
        
	}

}
