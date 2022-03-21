package LinkedList2;

public class DeleteNode_Recursive {
    

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(pos==0){
            return head.next;
        }
        if(head==null ||head.next==null){
            return head;
        }
        head.next = deleteNodeRec(head.next,  pos-1);
        return head;
	}

}