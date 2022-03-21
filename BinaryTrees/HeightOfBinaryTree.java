package BinaryTrees;

public class HeightOfBinaryTree {
    
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if (root==null)
        {
            return 0;
        }
        
        int smallLeftOutput=height(root.left);
        int smallRightOutput=height(root.right);
        if (smallLeftOutput>smallRightOutput)
        {
            return smallLeftOutput+1;
        }
        else
        {
            return smallRightOutput+1;
        }
	}

}
// public class Solution {
//     public static int r =0;
//      public static int l =0;

// 	public static int height(BinaryTreeNode<Integer> root) {
// 		if(root== null){
//             return 0;
//         }
        
//         int ans=0;
//         // if(root.right!=null){
//        r= height( root.right);
//         // if(root.left!=null){
//         l=    height(root.left);
        
//        if (l>r)
//         {
//             return l+1;
//         }
//         else
//         {
//             return r+1;
//         }
// 	}


// }