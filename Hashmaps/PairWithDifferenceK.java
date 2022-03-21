package Hashmaps;
import java.util.*;
public class PairWithDifferenceK {
    
	public static int getPairsWithDifferenceK(int arr[], int k) {
        int result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) { // only iterate once... best approach
            if(!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i)+1);
               int t1 = i-k, t2 = i+k;
            if(map.containsKey(t1) && k!=0) result += map.get(t1);  //watch hint video last approach
            if(map.containsKey(t2) && k!=0) result += map.get(t2);  //watch hint video last approach
        }
        int res2 = 0;
        if(k==0){
         for(Integer i : map.keySet())  res2 += map.get(i)*(map.get(i)-1)/2;     // nC2 = n(n-1)/2
            return res2;
        }
        return result;
	}
}
