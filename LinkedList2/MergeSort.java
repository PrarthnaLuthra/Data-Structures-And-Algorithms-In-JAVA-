package LinkedList2;

public class MergeSort {
    

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }
        LinkedListNode<Integer>slow = head;
        LinkedListNode<Integer>fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;

    }
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        LinkedListNode<Integer> t1=head1,t2=head2,tail3=null,head3=null;
        if(t1.data<=t2.data)
        {
            head3=t1;
            tail3=t1;
            t1=t1.next;
        }
        else
        {
            head3=t2;
            tail3=t2;
            t2=t2.next;
        }
        while(t1!=null &&t2!=null){
            if(t1.data<=t2.data)
            {
                tail3.next=t1;
                tail3=t1;
                t1=t1.next;
            }
            else
            {
                tail3.next=t2;
                tail3=t2;
                t2=t2.next;
            }

        }
        if(t1==null){
            tail3.next=t2;
        }if(t2==null){
            tail3.next=t1;
        }
        return head3;
    }




    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head==null || head.next== null){
            return head;
        }
        LinkedListNode<Integer> mpt= midPoint(head);
        LinkedListNode<Integer> head2= mpt.next;
        mpt.next=null;


        LinkedListNode<Integer> part1=mergeSort(head);
        LinkedListNode<Integer> part2=mergeSort(head2);
        LinkedListNode<Integer> merge= mergeTwoSortedLinkedLists(part1,part2);
        return merge;




        //Your code goes here

    }
}


