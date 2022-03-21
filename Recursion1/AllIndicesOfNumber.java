package Recursion1;

public class AllIndicesOfNumber {
    
	private static int[] allIndexes(int input[], int x,int startIndex) {
        
        if(startIndex==input.length){
            int myAns[]=new int [0];
            return myAns;
        }
       
       
                                            
  
		int smallAns[]=allIndexes(input, x, startIndex+1);
       
  
		if(input[startIndex]==x){
           int[] ans = new int[smallAns.length +1];
            ans[0]=startIndex;
        
        for(int i =0; i<smallAns.length;i++){
            ans[i+1]=smallAns[i];
        }return ans;
        
        }else{
        return smallAns;
	}
    }
    
  
    public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexes(input,x,0);
	}
	
}
