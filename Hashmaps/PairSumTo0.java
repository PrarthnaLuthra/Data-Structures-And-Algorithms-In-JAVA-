package Hashmaps;
import java.util.*;
public class PairSumTo0 {
    public static int PairSum(int[] input, int size) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Integer> pairSum= new HashMap<>();
        for(int i = 0; i<size;i++){
            int num = input[i];
            if(pairSum.containsKey(num)){
                pairSum.put(num,pairSum.get(num)+1);
            }
            else{
                pairSum.put(num,1);
            }}
            int finalCount = 0;
            for(int i=0; i < size; i++)
            {
                int key = input[i];
                if(pairSum.containsKey(-key) && pairSum.get(key)!=0)
                {
                    int times;
                    if (key == (-key)) { //True in case of zero
                        int occurences = pairSum.get(key);
                        times = (occurences * (occurences - 1)) / 2;
                        finalCount = finalCount+times;
                        pairSum.put(key, 0);
                        continue;
                    }
                    times = pairSum.get(key) * pairSum.get(-key);
                    finalCount = finalCount+times;
                   pairSum.put(key, 0);
                   pairSum.put(-key, 0);
                }
            }
            return finalCount;
        }
    }
