package LinkedList1;
import java.util.*;
public class PalindromeLL {
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> node=head;
            ArrayList<Integer> arr = new ArrayList<>();
            while (node!=null)
            {
                arr.add(node.data);
                node=node.next;
            }
            int start=0, end=arr.size()-1;
            while(start<end)
            {
                if (arr.get(start)!=arr.get(end))
                {
                    return false;
                }
                else
                {
                    start=start+1;
                    end=end-1;
                }
            }
            
            return true;
        }
    
    }