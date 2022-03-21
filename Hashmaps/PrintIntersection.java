package Hashmaps;
import java.util.*;
public class PrintIntersection {
    
	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                int value = map.get(arr1[i]);
                value+=1;
                map.put(arr1[i],value);
            }
            else
            {
                map.put(arr1[i],1);
            }
        }

        for(int j = 0;j<arr2.length;j++)
        {
            if(map.containsKey(arr2[j]))
            {

                int value = map.get(arr2[j]);

                if(value>0)
                {
                    System.out.println(arr2[j]+" ");
                    value--;
                    map.put(arr2[j],value);
                }

            }
        }
    }
}