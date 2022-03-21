package PriorityQueues;

public class CheckMaxHeap {
    
    public static boolean checkMaxHeap(int arr[]) {
        /*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if((2*i+1)<n && arr[i]<arr[2*i+1])
                return false;
            if((2*i+2)<n && arr[i]<arr[2*i+1])
                return false;
        }
        return true;
    }
}

