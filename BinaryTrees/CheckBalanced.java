package BinaryTrees;

public class CheckBalanced {
    public static boolean ansL;
    public static boolean ansR;
   
   public static int height(BinaryTreeNode<Integer> root) {
       //Your code goes here
       if (root==null)
       {
           return 0;
       }
       
       int smallLeftOutput=height(root.left);
       int smallRightOutput=height(root.right);
       if (smallLeftOutput>smallRightOutput)
       {
           return smallLeftOutput+1;
       }
       else
       {
           return smallRightOutput+1;
       }
   }

   public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
       if(root==null){
           return true;
       }
       if(height(root.left)-height(root.right)>=1||height(root.right)-height(root.left)>=1){
           return false;
       }else{
           ansL=checkBalanced(root.left);
           ansR=checkBalanced(root.right);
           
           if(ansL==false||ansR==false){
               return false;
           }
       
       }
       return true;

       /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
         * Taking input and printing output is handled automatically.
       */
   }

}