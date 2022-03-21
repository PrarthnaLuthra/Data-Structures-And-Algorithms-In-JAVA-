package BinaryTrees;

public class PreorderBinaryTree {
    
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
      
	}

}