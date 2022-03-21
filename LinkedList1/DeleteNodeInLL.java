package LinkedList1;

public class DeleteNodeInLL {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        LinkedListNode<Integer> temp=head;
        if(head==null){
            return head;
        }
        if(pos==0){
           
            return temp.next;
        }
        int i = 0;
    
        while(i<pos-1&&temp!=null){
            temp = temp.next;
            i++;
        }
        if(temp==null){
            return head;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
	}
}

