package BinaryTrees;


public class RemoveLeafNodes {
    
	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return null;}
        
        if(root.right==null && root.left==null){
        	return null;}
        
       BinaryTreeNode<Integer> left= removeAllLeaves(root.left);
         BinaryTreeNode<Integer> right =   removeAllLeaves(root.right);
       
        if(left==null){
            root.left=null;
        }
        
        
         if(right==null){
            root.right=null;
         }
        
        
        return root;
        


	}
	
	}



