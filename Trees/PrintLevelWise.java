package Trees;
import java.util.*;
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}

public class PrintLevelWise {
    
    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */

        Queue <TreeNode<Integer>> pendingNodes= new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){

            TreeNode<Integer> frontNode= pendingNodes.poll();
            if(frontNode == null){
                if(pendingNodes.isEmpty()){
                    break;
                }
                System.out.println();
                pendingNodes.add(null);
            }else{
                System.out.print(frontNode.data+" ");
                for(int i = 0; i< frontNode.children.size();i++){
                    pendingNodes.add(frontNode.children.get(i));
                   
                }

            }

        }

    }
}
