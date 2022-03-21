package Hashmaps;
import java.util.*;
public class MaximumFrequencyNumber {
    
    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
//         int output;
//         int freq;
        HashMap<Integer,Integer>seen=new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            int num = arr[i];
            if(seen.containsKey(num)){
                seen.put(num,seen.get(num)+1);
            }
            else{
                seen.put(num,1);
            }
        }int maxCount = Integer.MIN_VALUE, maxNum = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (seen.get(arr[i])>maxCount)
            {
                maxCount=seen.get(arr[i]);
                maxNum=arr[i];
            }
        }
        return maxNum;
    }
}
//         HashMap<Integer,Integer> countMap = new HashMap<>();

//         for (int i=0;i<arr.length;i++)
//         {
//             int ele=arr[i];
//             if (countMap.containsKey(ele))
//             {
//                 countMap.put(ele,countMap.get(ele)+1);
//             }
//             else
//             {
//                 countMap.put(ele,1);
//             }
            
//         }
        
//         int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
//         for (int i=0;i<arr.length;i++)
//         {
//             if (countMap.get(arr[i])>maxCount)
//             {
//                 maxCount=countMap.get(arr[i]);
//                 maxEle=arr[i];
//             }
//         }
//         return maxEle;
//     }
// }
    

