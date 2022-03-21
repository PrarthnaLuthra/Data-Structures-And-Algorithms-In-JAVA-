package Recursion2;

public class QuickSortCode {
    
    public static void quickSort(int[] input) {
        
        quickSort(input,0, input.length-1);

    }


    // public static void quickSort(int[] input, int si, int ei)
    // {
    //     if (si>=ei)
    //     {
    //         return;
    //     }
    //     int pivotIndex=partition(input,si,ei);
    //     quickSort(input, si, pivotIndex-1);
    //     quickSort(input,pivotIndex+1,ei);
    // }
     public static void quickSort(int[] input, int startIndex, int endIndex) {
        if(startIndex>=endIndex){
            return;
        }

        
            int c = partition(input, startIndex, endIndex);
            quickSort(input,startIndex,c-1 );
            quickSort(input, c+1,endIndex );

        }
    
    public static int partition(int[] a, int si, int ei)
    {
        int pivotElement=a[si];
        int smallerEleCount=0;
        for(int i=si+1;i<=ei;i++)
        {
            if (a[i]<pivotElement)
            {
                smallerEleCount++;
            }
        }
        
        int temp=a[si+smallerEleCount];
        a[si+smallerEleCount]=pivotElement;
        a[si]=temp;
        
        int i=si;
        int j=ei;
        while(i<j)
        {
            if (a[i]<pivotElement)
            {
                i++;
            }
            else if (a[j]>=pivotElement)
            {
                j--;
            }
            else
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        
        return si+smallerEleCount;
    }
	
}

// public class Solution {
//     public static int partition(int[] input, int startIndex, int endIndex){
//         //         find pivot position
//         int pivot = input[startIndex];
//         int count=0;
//         for(int i = startIndex+1; i<=input.length;i++){
//             if(input[i]<=input[startIndex]){
//                 count++;
//             }

//         }
//         int pivotPos = count+startIndex;
//         //         place pivot
//         int temp;
//         temp=input[startIndex+count];
//         input[startIndex+count]=input[startIndex];
//         input[startIndex]=temp;
//         //         ensure less on left more on right
//         int i =startIndex;
//         int j=endIndex;
//         while(i<j){
//             if(input[i]<=pivot){
//                 i++;
//             }else if(input[j]>pivot){
//                 j--;
//             }else{
//                 int c = input[i];
//                 input[i]=input[j];
//                 input[j]=c;

//                 i++;
//                 j--;

//             }
//         }
//         return pivotPos;

//   }}
   


    