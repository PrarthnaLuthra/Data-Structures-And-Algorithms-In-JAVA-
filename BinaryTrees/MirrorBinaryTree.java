package BinaryTrees;

public class MirrorBinaryTree {
    
public static BinaryTreeNode<Integer> temp=null;
public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
    //Your code goes here
    if(root==null){
        return;
    }
    temp=root.left;
    root.left=root.right;
    root.right=temp;

    
    mirrorBinaryTree( root.left);
    mirrorBinaryTree( root.right);
    
    
}

}