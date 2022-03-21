package PriorityQueues;
import java.util.*;
public class MergeKsortedArrays {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

        ArrayList<Integer> ary=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<input.size();i++){
            ArrayList<Integer> temp=input.get(i);
            for(int j=0;j<temp.size();j++)
                pq.add(temp.get(j));
        }

        while(!pq.isEmpty())
            ary.add(pq.remove());
        return ary;
    }

}

