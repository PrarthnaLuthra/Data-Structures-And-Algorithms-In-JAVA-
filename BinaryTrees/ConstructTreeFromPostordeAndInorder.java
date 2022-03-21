package BinaryTrees;
import java.util.*;

public class ConstructTreeFromPostordeAndInorder {
    

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        if (inOrder.length == 0 || postOrder.length == 0){
            return null;}
   int ip = inOrder.length - 1;
   int pp = postOrder.length - 1;
   
   Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
   BinaryTreeNode<Integer> prev = null;
   BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[pp]);
   stack.push(root);
   pp--;
   
   while (pp >= 0) {
       while (!stack.isEmpty() && stack.peek().data == inOrder[ip]) {
           prev = stack.pop();
           ip--;
       }
       BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(postOrder[pp]);
       if (prev != null) {
           prev.left = newNode;
       } else if (!stack.isEmpty()) {
           BinaryTreeNode<Integer> currTop = stack.peek();
           currTop.right = newNode;
       }
       stack.push(newNode);
       prev = null;
       pp--;
   }
   
   return root;
           
       
       
   }

   

}
//         return buildTree( postOrder, inOrder, 0, postOrder.length-1,0,inOrder.length-1);
//             //Your code goes here
//         }
//     public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int ps,int pe,int is,int ie) {
//         //Your code goes here
//         if(is>ie){
//             return null;
//         }

//         int rootData= postOrder[pe-1];
//         BinaryTreeNode<Integer>root= new BinaryTreeNode<Integer>(rootData);
//         int rootInIndex=-1;
//         for(int i =is;i<=ie;i++){
//             if(inOrder[i]==rootData){
//                 rootInIndex=i;
//                 break;
//             }
//         }
//         if(rootInIndex== -1){
//             return null;
//         }
//         int leftInS= is;
//         int leftInE=rootInIndex-1;
//         int leftPostS=ps;
//         int leftPostE=rootInIndex-1;
//         int rightInS= rootInIndex+1;
//         int rightInE=ie;
//         int rightPostS=rootInIndex+1;
//         int rightPostE=pe-1;
 
//         root.left=buildTree( postOrder, inOrder, leftPostS,  leftPostE,leftInS,leftInE);
//          root.right=buildTree( postOrder, inOrder, rightPostS,  rightPostE,rightInS,rightInE);
//         return root;



//     }

// }