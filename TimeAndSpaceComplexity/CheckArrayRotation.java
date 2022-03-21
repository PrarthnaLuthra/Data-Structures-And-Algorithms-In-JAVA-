package TimeAndSpaceComplexity;

public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
    	int n = arr.length;
        int i =0;
        int ans =0;
        for(i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                ans = i+1;
            }
        }   return ans;
    }

}