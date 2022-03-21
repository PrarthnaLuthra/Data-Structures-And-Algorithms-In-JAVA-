package LinkedList2;

public class EvenAfterOddLL {
    
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer>temp=head;
        LinkedListNode<Integer>oddH=null;
        LinkedListNode<Integer>oddT=null;
        LinkedListNode<Integer>evenH=null;
        LinkedListNode<Integer>evenT=null;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenH==null){
                    evenH=temp;
                    evenT=temp;
                }else{
                    evenT.next=temp;
                    evenT=temp;
                }

            }else{
                if(oddH==null){
                    oddH=temp;
                    oddT=temp;
                }else{
                    oddT.next=temp;
                    oddT=temp;
                }
            }
            temp=temp.next;
        }if(oddH==null)
		{
			return evenH;
		}
		if(evenH==null)
		{
			return oddH;
		}
		oddT.next=evenH;
		evenT.next=null;
		
		return oddH;


        //Your code goes here
    }
}