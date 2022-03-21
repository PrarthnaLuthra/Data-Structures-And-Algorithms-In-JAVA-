package Recursion1;

public class SumOfDigitsRecursive {
    
	public static int sumOfDigits(int input){
		// Write your code here
            if(input==0){
                return 0;
                
            }
	int smallAns=sumOfDigits(input/10);
        return input%10 + smallAns;
       

	}
}
