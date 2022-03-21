package LinkedList1;

public class PrintithNode {
    
    public static void printIthNode(LinkedListNode<Integer> head, int i){
        //Your code goes here
        int count =0;
        LinkedListNode<Integer> temp=head;
        while(count!=i && temp!=null){
            count++;
            temp = temp.next;
        }
        if (count==i&&temp!=null)
        {
            System.out.print(temp.data);
        }
    }
}