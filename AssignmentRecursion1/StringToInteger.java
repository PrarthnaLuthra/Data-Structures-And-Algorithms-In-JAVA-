package AssignmentRecursion1;

public class StringToInteger {
    
	public static int convertStringToInt(String input){
		// Write your code here
        if(input.length()==1){
            int ans = input.charAt(0) - '0' ;
            return ans;
        }
        int smallAns=convertStringToInt(input.substring(1));
        int b = ( input.charAt(0) - '0' )* (int)Math.pow(10,input.length()-1);
        return b+smallAns;

	}
}
