package Trees;

public class PostOrderTraversal {
    
	public static void printPostOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        if (root==null){
            return;
        }
        for(int i = 0;i<root.children.size();i++){
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
	}

}