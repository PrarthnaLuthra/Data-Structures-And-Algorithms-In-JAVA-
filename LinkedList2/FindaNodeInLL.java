package LinkedList2;

public class FindaNodeInLL {
    

    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        if(head==null){
            return -1;
        }else if (head!=null&& head.data==n){
            return 0;
        }else if(head.next==null&& head.data!=n){
            return -1;
            }
        int ans = findNodeRec( head.next, n);
        if(ans== -1){
            return -1;
        }else{
            return ans+1;
        }

        //Your code goes here
    }

}