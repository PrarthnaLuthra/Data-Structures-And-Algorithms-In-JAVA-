package BinaryTrees;

public class ConstructTreeFromPreorderAndInorder {
    
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return helper(0, 0, inOrder.length - 1,  preOrder, inOrder);
    }
    
     private static BinaryTreeNode<Integer> helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        
        //base condition
        if (preStart > preorder.length - 1 || inStart > inEnd) 
            return null;
        
        //get the root node with curr preorder element
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[preStart]);
        
        //get inIndex; finding preorder's element's index in inorder
        int inIndex = 0;
        
        for (int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.data) {
                inIndex = i; 
            }
        }
        //(next, left of inIndex is the end for left subtree)
        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        //(prestart + length of left subtree + 1)
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        
        return root;
    }

}
    // public static BinaryTreeNode<Integer>root;
    // public static BinaryTreeNode<Integer>root.left;
    // public static BinaryTreeNode<Integer>root.right; 
// public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
//         return buildTree(0, 0, inOrder.length - 1,  preOrder, inOrder);
//     }


   
//     public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder,int ps, int pe, int is, int ie) {
//         //Your code goes here
//         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[ps]);
//         if (ps > preOrder.length - 1 || is> ie) {
//             return null;
//         }
//         // root.Data=preOrder[0];
//         int inIndex = 0;
        
//         for (int i = is;i<=ie;i++) {
//             if(inOrder[i]==root.data){
//                 inIndex = i; 
//             }
//         }

//         // root.left= buildTree(preOrder,inOrder,ps+1,ps+count,is,count-1);
//         // root.right=buildTree(preOrder,inOrder,ps+count+1,preOrder.length-1,count+1,inOrder.length-1);
//         // return root;
//          root.left= buildTree(preOrder,inOrder,ps+1,ps+inIndex,is,inIndex- 1);
//         	        root.right=buildTree(preOrder,inOrder,ps+inIndex-is+1,pe,inIndex+1,ie);
//         	        return root;



//     }

// }
