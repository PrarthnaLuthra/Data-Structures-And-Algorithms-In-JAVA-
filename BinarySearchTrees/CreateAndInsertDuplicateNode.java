package BinarySearchTrees;

public class CreateAndInsertDuplicateNode {
    public static BinaryTreeNode<Integer>root;

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        // BinaryTreeNode<Integer>save= root.left;
        
        BinaryTreeNode<Integer>newNode=new BinaryTreeNode<Integer>(root.data);
        
        newNode.left=root.left;
        root.left= newNode;
        insertDuplicateNode(newNode.left);
        insertDuplicateNode(root.right);
        
	}
}
//     public static void insert(int data) {
// 		//Implement the insert() function
//         root=insert( data,root);
//         return;
        
// 	}
//     private static BinaryTreeNode<Integer>  insert(int data,BinaryTreeNode<Integer>root) {
// 		//Implement the insert() function
//         if(root==null){
//             BinaryTreeNode<Integer>newNode = new BinaryTreeNode<Integer>(data);
//             return newNode;
            
            
//         }
//         if(root.data>=data){
//             root.left= insert( data,root.left);
//         }else{
//             root.right= insert( data,root.right);
//         }
//         return root;
// 	}
	
// }