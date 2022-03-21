package BinarySearchTrees;
class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) { this.data = data; } }

public class SearchNodeInBST {
    
public static boolean ans ;
public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
    
    if(root==null){
        return false;
    }
    if(root.data==k){
        return true;
    }else if (root.data > k){
       ans= searchInBST( root.left,  k);
    }else if (root.data < k){
       ans= searchInBST( root.right,  k);
    }
    return ans;
}
}