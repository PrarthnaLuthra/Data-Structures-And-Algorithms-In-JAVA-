package BinarySearchTrees;

public class CheckIfBinaryTreeIsBST {
    public static boolean ansL;
    public static boolean ansR;

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root==null)
		{
			return true;
		}
		
		int leftMax = largest(root.left);
		if(leftMax>=root.data)
		{
			return false;
		}
		int rightMin = minimum(root.right);
		if(rightMin<root.data)
		{
			return false;
		}
		
		boolean left = isBST(root.left);
		boolean right = isBST(root.right);
		
		return left && right;
	}
	
	public static int largest(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int left = largest(root.left);
		int right = largest(root.right);
		
		return Math.max(root.data, Math.max(left, right));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		int left = minimum(root.left);
		int right = minimum(root.right);
		
		return Math.min(root.data, Math.min(left, right));
	}
}
//         if(root==null){
//             return false;
//         }
//         if(root.left==null&&root.right==null){
//             return false;
//         }
//         if(root.left==null&&root.right.data>=root.data){
//             return true;
//         }
//         if(root.right==null&&root.left.data<root.data){
//             return true;
//         }
        
//         if(root.left.data<root.data&&root.right.data>=root.data){
//             return true;
//         }
//         ansL=isBST(root.left);
//         ansR=isBST(root.right);
        

// 		/* Your class should be named Solution
// 		 * Don't write main().
// 		 * Don't read input, it is passed as function argument.
// 		 * Return output and don't print it.
// 	 	 * Taking input and printing output is handled automatically.
//         */
//         return false;
// 	}

// }