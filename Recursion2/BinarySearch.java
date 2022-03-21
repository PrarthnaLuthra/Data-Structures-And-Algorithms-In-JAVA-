package Recursion2;

public class BinarySearch {
    public static int binarySearch(int input[],int high ,int low, int element) {
		// Write your code here
        
        int mid;
        if(high>=low){
            mid=(high+low)/2;
        
        if(input[mid]==element){
            return mid;
        }else if(input[mid]>element){
            return binarySearch(input,mid-1,low,element);
        }else {
            return binarySearch(input,high,mid+1,element);
        }}
        else{
            return -1;
        }
     
    }
	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
        return binarySearch(input, input.length, 0, element);

	}
}

