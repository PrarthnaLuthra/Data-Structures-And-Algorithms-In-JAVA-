package BinaryTrees;
import java.util.*;
public class LevelOrderTraversal {
    
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue <BinaryTreeNode<Integer>> pendingNodes= new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> frontNode= pendingNodes.poll();
            if(frontNode == null){
                System.out.println();
                if(pendingNodes.isEmpty()){
                    break;
                }

                pendingNodes.add(null);
                continue;

            }System.out.print(frontNode.data+" ");
            if(frontNode.left!=null){
                pendingNodes.add(frontNode.left);
            }
            if(frontNode.right!= null){
                pendingNodes.add(frontNode.right);
            }
        }

    }

}


