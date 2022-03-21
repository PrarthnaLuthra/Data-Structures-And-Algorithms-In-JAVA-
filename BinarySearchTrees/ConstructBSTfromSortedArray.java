package BinarySearchTrees;

public class ConstructBSTfromSortedArray {
    
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        BinaryTreeNode<Integer> output=SortedArrayToBST(arr, 0, n-1);
        return output;


    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int si, int ei){
        if (si>ei){
            return null;
        }
        int mid = (si+ei)/2;
           BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
        // root.data= arr[mid];
        root.left= SortedArrayToBST(arr,si, mid-1);
        root.right=SortedArrayToBST(arr,mid+1,ei);
        return root;




    }
}