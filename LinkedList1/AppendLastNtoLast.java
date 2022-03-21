package LinkedList1;

public class AppendLastNtoLast {
    
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> node=head,checkNode=null,newHead=null;
  if (n==0)
  {
      return head;
  }
  
  int count=0;
  while(node!=null)
  {
      node=node.next;
      count=count+1;
  }
  if (count<n)
  {
      return head;
  }
  
  n=count-n;
  node=head;
  for (int i=0;i<n-1;i++)
  {
      node=node.next;
  }
  checkNode=node.next;
  node.next=null;
  newHead=checkNode;
  
  while(checkNode.next!=null)
  {
      checkNode=checkNode.next;
  }
  checkNode.next=head;
  // head=newHead;
  return newHead;
  
}

}