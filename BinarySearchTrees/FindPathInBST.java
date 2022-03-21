package BinarySearchTrees;
import java.util.ArrayList;

public class FindPathInBST {
    
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer>output= new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        if(data<root.data){
            ArrayList<Integer>leftOutput= getPath( root.left, data);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }else{
                return null;
            }
        }else{
            ArrayList<Integer>rightOutput= getPath( root.right, data);
            if(rightOutput!=null){
                rightOutput.add(root.data);
                return rightOutput;
            }else{
                return null;
            }
            
        }
	}
}