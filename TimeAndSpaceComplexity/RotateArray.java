package TimeAndSpaceComplexity;

public class RotateArray {
    
    public static void rotate(int[] arr, int d) {
    	    
        int n=arr.length;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];     
        }
        for(int i=0;i<arr.length-d;i++){
            arr[i]=arr[i+d];
        }
        for(int i=0;i<d;i++){
            arr[i+n-d]=temp[i];
        }
         
        
    }
    
}
      
