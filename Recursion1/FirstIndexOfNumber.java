package Recursion1;

public class FirstIndexOfNumber {
    private static int firstIndex(int input[], int x, int startIndex ){
        if(startIndex==input.length){
            return -1;
        }
        if(input[startIndex]==x){
            return startIndex;
        }
        int smallAns = firstIndex(input,x,startIndex+1);
        return smallAns;
    }

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return firstIndex(input,x,0);
	
	}
	
}
