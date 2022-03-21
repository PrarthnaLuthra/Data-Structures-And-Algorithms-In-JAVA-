package BinarySearchTrees;

public class LCAofBinaryTree {
    
	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return -1;
        }
        if(a==root.data || b==root.data){
            return root.data;
        }
        int right = getLCA(root.right,a,b);
        int left = getLCA(root.left,a,b);
        if(left==-1&& right!=-1){
            return right;
        }
        if(right==-1&& left!=-1){
            return left;
        }
         if(right==-1&& left==-1){
            return -1;
        }
        if(right!=-1&& left!=-1){
            return root.data;
        }
        return -1;
	}

}