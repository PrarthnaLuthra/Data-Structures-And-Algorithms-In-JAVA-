package TimeAndSpaceComplexity;

public class FindTheUniqueElement {
    
	public static int findUnique(int[] arr) {
        int ans=0;
        for(int i = 0; i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
		//Your code goes here
	}
}
