package BinaryTrees;

public class FindNode {
    

    public static boolean ansR=false;
     public static boolean ansL=false;

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.left!=null){
        ansL=isNodePresent( root.left,  x); }
        if(root.right!=null){
        ansR=isNodePresent( root.right,  x); }
        if(ansL==true||ansR==true){
            return true;
        }
        return  false;
	}

}