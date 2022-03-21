package Test2;
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

public class NextNumber {
    
    public static void deleteAlternateNodes(Node<Integer> head) {
      

        Node<Integer> cur = head;
            Node<Integer> curNext;
    
            while(cur != null && cur.next != null) 
            {	
                curNext = cur.next;
                cur.next = curNext.next;
              
                cur = cur.next;
    }
}
}    