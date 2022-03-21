package LinkedList2;

public class BubbleSort_Iterative_LL{
    
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head, index = null;  
       int temp;  
         
       if(head == null) {  
           return head;  
       }  
       else 
       {  
           while(current != null) 
           {  
               //Node index will point to node next to current  
               index = current.next;  
                 
                   while(index != null) 
                {  
                   //If current node's data is greater than index's node data, swap the data between them  
                   if(current.data > index.data)
                   {  
                       temp = current.data;  
                       current.data = index.data;  
                       index.data = temp;  
                   }  
                   index = index.next;  
                   }  
                   current = current.next;  
           }  
           
       }  return head;
       
   }



}