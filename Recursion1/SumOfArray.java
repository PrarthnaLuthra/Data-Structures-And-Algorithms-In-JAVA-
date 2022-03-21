package Recursion1;

public class SumOfArray {
    public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int n = input.length;
       
        if(n==1){
            return input[0];
        }
		int smallAns[]=new int[n-1];
        for(int i=1;i<n;i++){
            smallAns[i-1]=input[i];
        }
        
        return input[0]+ sum(smallAns);
	}
}