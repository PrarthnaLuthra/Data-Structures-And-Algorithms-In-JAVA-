package BinaryTrees;

public class SumOfNodes {
    
	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
        if(root==null){
            return 0;
        }
        int sum = root.data;
        int sumL=getSum(root.left); 
        int sumR=getSum(root.right); 
        return sum+sumL+sumR;
	}

}