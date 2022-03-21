package LinkedList2;

public class ReverseLL_Iterative {
    
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer>prev=null;
        LinkedListNode<Integer>curr= head;
        LinkedListNode<Integer>temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
      
    
        
        
	}
}
