package Recursion2;

public class ReturnPermutations {
    public static String[] permutationOfString(String input){
	
		// Write your code here
        if(input.length()==0){
            String[]ans= {""};
            return ans;
        }
		
        String [] smallAns= permutationOfString(input.substring(1));
        String output[]  = new String[smallAns.length * input.length()];
        int k = 0;
        for(int i = 0; i<smallAns.length;i++){
            //loop over strings
            for(int j = 0; j<input.length(); j++){
                //build each string as string = before + character + after
               output[k] = smallAns[i].substring(0,j) + input.charAt(0) + smallAns[i].substring(j,smallAns[i].length());
                k++;
            }
        }
        
        return output;
		
	}

}
