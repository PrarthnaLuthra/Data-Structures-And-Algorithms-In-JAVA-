package Recursion1;

public class CountZeroes {
    
	public static int countZerosRec(int input){
		// Write your code here
        if(input==0){
            return 1;
        }
        if(input/10==0 && input!=0){
            return 0;
        }
        
        int smallAns=countZerosRec(input/10);
        if(input%10==0){
            return smallAns+1;
        }else{
            return smallAns;
        }
        
	}
}
