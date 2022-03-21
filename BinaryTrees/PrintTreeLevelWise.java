package BinaryTrees;
import java.util.*;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PrintTreeLevelWise {
    public static BinaryTreeNode<Integer>front;

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root.data==-1){
            return;
        }
        //Your code goes here
       Queue <BinaryTreeNode<Integer>> pendingNodes= new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
          
            try{
                front=pendingNodes.poll();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print(front.data+":");
            if(front.left!=null){
                pendingNodes.add(front.left);
                System.out.print("L:"+front.left.data+",");
            }else{
                 System.out.print("L:-1,");
            }
             if(front.right!=null){
                  pendingNodes.add(front.right);
                System.out.print("R:"+front.right.data);
                   System.out.println();
            }else{
                 System.out.print("R:-1");
                 System.out.println();
            }
           

            
        }

    }

}
