package BinaryTrees;

public class NodesWithoutSibling {
    
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        if(root.left!=null&&root.right==null){
            System.out.print(root.left.data+" ");
        }else if(root.right!=null&&root.left==null){
            System.out.print(root.right.data+" ");
        }
        printNodesWithoutSibling( root.left );
         printNodesWithoutSibling( root.right );
        
	}

}
