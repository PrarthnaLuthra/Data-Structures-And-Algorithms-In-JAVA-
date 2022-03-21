package BinarySearchTrees;

public class BSTclass {
    
    private BinaryTreeNode<Integer>root;
	public void insert(int data) {
		//Implement the insert() function
        root=insert( data,root);
        return;
        
	}
    private BinaryTreeNode<Integer>  insert(int data,BinaryTreeNode<Integer>root) {
		//Implement the insert() function
        if(root==null){
            BinaryTreeNode<Integer>newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
            
            
        }
        if(root.data>=data){
            root.left= insert( data,root.left);
        }else{
            root.right= insert( data,root.right);
        }
        return root;
	}
	
    
	private BinaryTreeNode<Integer> remove(int data,BinaryTreeNode<Integer>root) {
		//Implement the remove() function
        if(root==null){
            return null;
        }
        if(root.data>data){
            root=remove(data,root.left);
            return root;
        }else if(root.data<data){
             root=remove(data,root.right);
            return root;
        }else{
            if(root.left==null&&root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                BinaryTreeNode<Integer>minNode= root.right;
                while(minNode.left !=null){
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right=remove(minNode.data,root.right);
                return root;
                
            }
        }

	}
	public void remove(int data) {
		//Implement the remove() function
        root=remove( data,root);
        return;
	}
   



	
	private void printHelper(BinaryTreeNode<Integer>root) {
		//Implement the printTree() function
         if(root==null)
            return ;
       // String s=root.data+":";
        System.out.print(root.data+":");
        if(root.left!=null)
            // s=s+"L:"+root.left.data+",";
            System.out.print("L:"+root.left.data+",");
        if(root.right!=null){
        // s=s+"R:"+root.right.data;
            System.out.print("R:"+root.right.data);
        }
        // System.out.println(s);
        System.out.println();
        printHelper(root.left);
        printHelper(root.right);
        return;
	}
    public void printTree() {
		//Implement the printTree() function
        printHelper(root);
	}
	
	public boolean search(int data) {
		//Implement the search() function
        return searchHelper(data,root);
        
	}
    private boolean searchHelper(int data, BinaryTreeNode<Integer>root ) {
		//Implement the search() function
        if (root==null){
            return false;
        }if(root.data==data){
            return true;
        }if(data<root.data){
            return searchHelper(data, root.left );
        }else{
             return searchHelper(data, root.right );
        }
        
	}
	

}