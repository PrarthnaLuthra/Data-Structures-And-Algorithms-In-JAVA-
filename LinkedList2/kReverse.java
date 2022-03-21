package LinkedList2;

public class kReverse {
    
	

    /*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(k==0){
            return head;
        }
		LinkedListNode<Integer>prev=null;
        LinkedListNode<Integer>curr= head;
        LinkedListNode<Integer>temp=null;
        int count =0;
        
        while(count<k&&curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        if(temp!=null){
            head.next= kReverse(temp,k);
            
        }
        return prev;
    }
}
}