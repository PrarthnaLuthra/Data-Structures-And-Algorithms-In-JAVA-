package Recursion1;

public class LastIndexOfNumber {
    
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return lastIndex( input, x,0, input.length-1);
	}
	 private static int lastIndex(int input[], int x,int si,int ei) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(si>ei){
            return -1;
        }
        int smallAns = lastIndex(input,x,si+1,ei);
        if(smallAns!=-1){
            return smallAns;
        }
        if(input[si]==x){
            return si;
        }
        return smallAns;
	}
}