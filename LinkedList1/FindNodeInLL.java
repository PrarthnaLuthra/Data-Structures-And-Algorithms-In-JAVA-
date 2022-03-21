package LinkedList1;

public class FindNodeInLL {
    public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        int i = 0;
        while(head!=null){
            if(head.data==n){
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;
	}
}
