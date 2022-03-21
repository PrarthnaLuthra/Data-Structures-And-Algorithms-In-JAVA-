package LinkedList2;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class MidpointOfLL {
    
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

}