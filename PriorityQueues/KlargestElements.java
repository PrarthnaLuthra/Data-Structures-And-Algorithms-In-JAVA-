package PriorityQueues;
import java.util.*;
public class KlargestElements {
    
    public static ArrayList<Integer> kLargest(int input[], int k) {
        /* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> output = new ArrayList<>();
        int i = 0;
        for(;i<k;i++){
            pq.add(input[i]);
        }
        for(;i< input.length;i++){
            int min = pq.element();
            
            
            if(min<input[i]){
                pq.remove();
                pq.add(input[i]);
                }
        }
        while(!pq.isEmpty()){
            output.add (pq.remove());
        }
        return output;
    }
}