package Recursion2;

public class PrintSubsetSumToK {
    
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        int output[]=new int[0];
         printSubsetsSumTok(input, k, 0,output);
        return;
		
	}public static void printSubsetsSumTok(int input[], int k, int si,int output[]) {
		// Write your code here
        if(si==input.length){
            if(k==0){
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
            }else{
                return;
            }
        }
        printSubsetsSumTok(input, k, si+1,output);
        int[]newOutput= new int [output.length+1];
        int i = 0;
        for(;i<output.length;i++){
            newOutput[i]=output[i];
        }
         newOutput[i]=input[si];
        printSubsetsSumTok(input, k-input[si], si+1,newOutput);
        
		
	}
}
