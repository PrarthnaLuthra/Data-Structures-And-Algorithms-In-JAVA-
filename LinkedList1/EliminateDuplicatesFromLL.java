package LinkedList1;

public class EliminateDuplicatesFromLL {
    
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        //Your code goes here
       LinkedListNode<Integer>t1=head;
        // LinkedListNode<Integer>t2=head.next;
        if (head==null || head.next==null){
            return head;
        }
        while(t1.next!=null){
            if(t1.data.equals(t1.next.data)){
                t1.next=t1.next.next;
            }else{
                t1= t1.next;

            }

        }
        return head;
    }

}