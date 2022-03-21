package Trees;
import java.util.*;
public class ReplaceNodeWithDepth {
    
	 static int a=0;
	
     public static void replaceWithDepthValue(TreeNode<Integer> root){
 
 
         
         
         Queue<TreeNode<Integer>> queue = new LinkedList<>();
         //added 1st level here 
         queue.add(root);
         queue.add(null);
 
         while(!queue.isEmpty())
         {    
             TreeNode<Integer> frontNode = queue.poll();
             
             if(frontNode == null)
             {
                 if(queue.isEmpty())
                 {
                     break;
                 }
                
                 a++;
                 queue.add(null);
             }
             else
             {
                 frontNode.data=a;
                 for(int i=0;i<frontNode.children.size();i++)
                 {
                     queue.add(frontNode.children.get(i));
                 }
                 
                 
             }
             
         }
         
     
     }
     
     
 }
