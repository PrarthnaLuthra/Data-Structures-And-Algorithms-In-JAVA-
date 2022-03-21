package LinkedList2;

public class ReverseLL_Recurcive {
    
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        // if(head==null){
        //     return head;
        // }
            
         if(head==null||head.next==null){
             return head;
         }
         LinkedListNode<Integer>finalHead=reverseLinkedListRec(head.next);
          LinkedListNode<Integer>temp=finalHead;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=head;
         head.next=null;
         
         return finalHead;
         
         //Your code goes here
    }
 
}