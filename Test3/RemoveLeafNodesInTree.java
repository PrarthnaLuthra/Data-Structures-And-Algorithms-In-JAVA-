package Test3;
import java.util.*;
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}
public class RemoveLeafNodesInTree {
    
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

        if (root.children.size() == 0){
            root = null;
            return root;
        }


        for(int i=root.children.size()-1 ; i >= 0 ; i--){
            if (removeLeafNodes(root.children.get(i)) == null){
                root.children.remove(root.children.get(i));
            }
        }
        return root;
    }
}