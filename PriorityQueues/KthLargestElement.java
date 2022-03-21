package PriorityQueues;
import java.util.*;
public class KthLargestElement {
   
	public static int kthLargest(int n, int[] input, int k) {
		if(input.length==0)
            return Integer.MIN_VALUE;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        for(;i<k;i++)
        {
            pq.add(input[i]);
        }
        for(;i<input.length;i++){
            int min=pq.element();//pq.peek;
            if(min<input[i])
            {    pq.remove();
             pq.add(input[i]);
            }
        }
        return pq.remove();
	}
}