package Recursion1;

public class CheckNumberInArray {
    
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length<=1){
            return false;
        }
        
         if(input[0]==x){
            return true;
        }
        int n = input.length;
        int smallInput[]=new int[n-1];
        for(int i=1;i<n;i++){
            smallInput[i-1]=input[i];
        }
       
        boolean smallAns =checkNumber(smallInput,x);
        return smallAns;
        
		
	}
}