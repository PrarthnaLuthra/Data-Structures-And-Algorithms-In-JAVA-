package Recursion2;

public class MergeSortCode {
    public static  void mergeSort(int arr[], int start, int mid, int end) 
    {
        int n1 = mid - start + 1; 
        int n2 = end - mid; 
  
       
        int arr1[] = new int [n1]; 
        int arr2[] = new int [n2]; 
  
  
        for (int i=0; i<n1; ++i) 
            arr1[i] = arr[start + i]; 
        for (int j=0; j<n2; ++j) 
            arr2[j] = arr[mid + 1+ j]; 
  
  
         
        int i = 0, j = 0; 
  
      
        int k = start; 
        while (i < n1 && j < n2) 
        { 
            if (arr1[i] <= arr2[j]) 
            { 
                arr[k] = arr1[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = arr2[j]; 
                j++; 
            } 
            k++; 
        } 
  
    
        while (i < n1) 
        { 
            arr[k] = arr1[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < n2) 
        { 
            arr[k] = arr2[j]; 
            j++; 
            k++; 
        } 
    } 

  public static   void sort(int arr[], int start, int end) 
    { 
        if (start < end) 
        { 
         
            int mid = (start+end)/2; 
  
          
            sort(arr, start, mid); 
            sort(arr , mid+1, end); 
  
            
            mergeSort(arr, start, mid, end); 
        } 
    } 
  
    

    

	public static void mergeSort(int[] input){
		
       
		int p1=input.length-1;
        sort(input,0,p1);
        
        
	}
}
