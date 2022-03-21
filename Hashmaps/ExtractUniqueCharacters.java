package Hashmaps;
import java.util.*;
public class ExtractUniqueCharacters {
    
	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        HashMap<Character,Integer> output = new HashMap<>();
        String x ="";
        for(int i = 0; i<str.length();i++){
            if(!output.containsKey(str.charAt(i))) {
				x+=str.charAt(i);
				output.put(str.charAt(i),1);
			}
		}
		return x;
	}
}
