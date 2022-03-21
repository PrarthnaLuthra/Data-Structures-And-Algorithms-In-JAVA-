package StacksAndQueues;
import java.util.*;
public class MaximumBracketReversal {
    
	public static int countBracketReversals(String input) {
        if (input.length()%2!=0)
      {
          return -1;
      }
      Stack<Character> stack=new Stack<Character>();
      int count=0;
      for (int i=0;i<input.length();i++)
      {
          char c=input.charAt(i);
          if (c=='{')
          {
              stack.push(c);
          }
          else
          {
              if (stack.isEmpty())
              {
                  stack.push(c);
              }
              else if (stack.peek()=='}')
              {
                  stack.push(c);
              }
              else if (stack.peek()=='{')
              {
                  stack.pop();
              }
          }
      }
      
      while(!stack.isEmpty())
      {
          char c1=stack.pop();
          char c2=stack.pop();
          
          if (c1==c2)
          {
              count=count+1;
          }
          else
          {
              count=count+2;
          }
      }
      return count;
      
  }

}
// 	Stack<Character> stack =new Stack<>();
      
      
//         for(int i = 0; i<input.length();i++){
//             if(input.charAt(i)=='{'){
//                 stack.push(input.charAt(i));
//             }
//             if(input.charAt(i)=='}'&& stack.peek()=='{' && stack.isEmpty()!=true){
//                 stack.pop();
//             }
          
//         }
//         if(stack.size()%2==0 && stack.isEmpty()!=true){
//             return stack.size()/2;
//         }else{
//             return -1;
//         }
//     }
// }