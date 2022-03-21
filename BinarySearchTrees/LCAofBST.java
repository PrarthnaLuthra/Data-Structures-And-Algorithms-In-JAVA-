package BinarySearchTrees;

public class LCAofBST {
    

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null)
             return -1;
         int c=-1;
         if(root.data==a || root.data==b)
             return root.data;
       
        else if(a<root.data && b>root.data || a>root.data && b<root.data)
         {
              c=getLCA(root.left,a,b);
             int d=getLCA(root.right,a,b);
             if(c==-1 && d==-1)
                 return -1;
             else if(c==-1 && d!=-1)
                 return  d;
             else if(c!=-1 && d==-1)
                 return c;
             else
                 return root.data;
         }
         
          else if(a<root.data &&b<root.data)
         {
              c=getLCA(root.left,a,b);
         }
        else if(a>root.data &&b>root.data)
         {
              c=getLCA(root.right,a,b);
         }
     
         if(c!=-1)
             return c;
          else
             return -1;
 
 
     }
 }
