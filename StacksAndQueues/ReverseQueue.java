package StacksAndQueues;
// import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        // Queue<Integer> ans  = new LinkedList<>();
        // int i =0;
        // while(i<input.size()){
        //     int temp=input.poll();
        //     input.add(temp);
        //     i++;
        // }
        if(input.size()<=1)
            return;
        int temp=input.poll();
        
        reverseQueue(input);
        
        input.add(temp);
        
	}
	
}

