package TimeAndSpaceComplexity;

public class DuplicateInArray {
    public static int findDuplicate(int[] arr) {
		int n = arr.length - 2;
        int sum1 = 0;
        int sum2 = (n*(n+1))/2;
        for(int i = 0 ; i<arr.length;i++){
            sum1+=arr[i];
            
        }return sum1-sum2;
        
	}
}