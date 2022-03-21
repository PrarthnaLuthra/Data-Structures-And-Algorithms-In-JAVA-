package Trees;
import java.util.*;
public class StructurallyIdentical {
    
	public static boolean isIdentical = true;
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
	if (root1.data != root2.data || root1.children.size() != root2.children.size()) {
			return false;
		} 
		Queue<TreeNode<Integer>> queue1 = new LinkedList<>();
		for (int i = 0; i < root1.children.size(); i++) {
			queue1.add(root1.children.get(i));
		}
		Queue<TreeNode<Integer>> queue2 = new LinkedList<>();
		for (int i = 0; i < root2.children.size(); i++) {
			queue2.add(root2.children.get(i));
		}
		if (!queue1.isEmpty() && !queue2.isEmpty()) {
			try {
				isIdentical = checkIdentical(queue1.peek(), queue2.peek());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isIdentical;
}
}
	
