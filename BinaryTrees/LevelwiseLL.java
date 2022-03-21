package BinaryTrees;
import java.util.*;
class LinkedListNode<T> 
	  { 
	  		T data; 
	  		LinkedListNode<T> next;
	 		public LinkedListNode(T data) 	
	 		{
	  		this.data = data; 
	 	} 
	   }

public class LevelwiseLL {
  
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
       			
       			// Write your code here
      
       	ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();
          if(root== null){
            output= null;
              return output;
        }
       	        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
       			pendingNodes.add(root);
       			pendingNodes.add(null);
       			while (!pendingNodes.isEmpty()) {
       				BinaryTreeNode<Integer> currentNode = null;
       				int counter = pendingNodes.size();
       				 LinkedListNode<Integer> head = null;
					LinkedListNode<Integer> tail = null;
       				for (int i = 0; i < counter; i++) {
       					try {
       						currentNode = pendingNodes.poll();
       					} catch (Exception e) {
       						e.printStackTrace();
       					}
       					if (currentNode != null) {
       						if (head == null) {
       							head = new LinkedListNode<>(currentNode.data);
       							tail = head;
       						} else {
       							tail.next =new LinkedListNode<>(currentNode.data);
       							tail = tail.next;
       						}
       						if (currentNode.left != null) {
       							pendingNodes.add(currentNode.left);
       						}
       						if (currentNode.right != null) {
       							pendingNodes.add(currentNode.right);
       						}
       					} else {
       						output.add(head);
       						head = null;
       						tail = null;
       						if (!pendingNodes.isEmpty()) {
       							pendingNodes.add(null);
       						}
       					}
       				}
       			}
       			return output;
       	}
       		}
       	    