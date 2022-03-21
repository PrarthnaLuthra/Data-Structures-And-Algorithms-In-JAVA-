package Recursion2;

public class PrintSubsetOfArray {
    public static void printSubsets(int input[]) {
		// Write your code here
        int[]output = new int [0];
        printSubsets(input, 0, output) ;
        
        

	}
    public static void printSubsets(int input[], int si, int output[]) {
		// Write your code here
         if (si==input.length)
        {
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        printSubsets( input, si+1, output);
        int[]newOutput= new int [output.length+1];
        int i = 0;
        for(;i<output.length;i++){
            newOutput[i]=output[i];
        }
         newOutput[i]=input[si];
        printSubsets( input, si+1, newOutput);

	}
}

    
        
