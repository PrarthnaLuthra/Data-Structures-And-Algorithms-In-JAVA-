package BinarySearchTrees;
import java.util.*;

public class PathSumRootToLeaf {
   
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        ArrayList<Integer> path = new ArrayList<Integer>();
        helper( root, k, path);
	}
    public static void helper(BinaryTreeNode<Integer> root, int k, ArrayList<Integer> path ){
        if(root== null){
            return;
        }
        path.add(root.data);
        k-=root.data;
        if(root.left==null&&root.right==null){
            if(k ==0){
                for(int i:path){
                    System.out.print(i+" ");
                }System.out.println();
            }path.remove(path.size()-1);
            return;
        }
        helper( root.left, k, path);
        helper( root.right, k, path);
        path.remove(path.size()-1);
        
    }

}
