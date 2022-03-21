package Trees;
import java.util.*;
public class SecondLargestElementInTree {
        
    
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        if(root.children.size() == 0){
            return null;
        }
      Queue<TreeNode<Integer>> queue = new LinkedList<>();
      TreeNode<Integer> lar=root,slar=null;
      int temp = 0;
      queue.add(root);
    

      while(!queue.isEmpty())
      {
          TreeNode<Integer> frontNode = queue.poll();

               for(int i=0;i<frontNode.children.size();i++){
                  queue.add(frontNode.children.get(i));
              }
          
              if(frontNode.data >  temp){
                  if(frontNode.data > lar.data){
                      slar = lar;
                      temp = lar.data;
                      lar = frontNode;
                  }
                  else if (frontNode.data < lar.data){
                      slar = frontNode;
                      temp = slar.data;
                  }
              }
              
              
          
          }
          
      
      return slar;
  

  }
  
  
}

  /*	TreeNode structure 
* 
* class TreeNode<T> {
      T data;
      ArrayList<TreeNode<T>> children;

      TreeNode(T data){
          this.data = data;
          children = new ArrayList<TreeNode<T>>();
      }
  }*/


//     public static TreeNode<Integer>largest=null;
//     public static TreeNode<Integer>slar=null;
//     public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
      
//         if(root==null){
//             return null;
//         }
      
//         largest= root;
//         slar=null;
      
      
//         for(int i =0; i<root.children.size();i++){
//            largest= findSecondLargest( root.children.get(i));
          
          
//         }if(root.children.get(i).data>largest.data&&largest.data> slar.data){
              
//                 slar=largest;
//                 largest=root.children.get(i);
             
//             }else if(root.children.get(i).data>largest.data){
//                 largest=root.children.get(i);
//             }
//         return slar;


//         // Write your code here

//     }


// }

