package StacksAndQueues;
import java.util.*;

public class BalancedParethesis {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack =new Stack<>();
        
        if(stack.isEmpty()==true&& expression.charAt(0)==')'){
            return false;
        }  
        for(int i = 0; i<expression.length();i++){
            if(expression.charAt(i)=='('){
                stack.push(expression.charAt(i));
            }
            if(expression.charAt(i)==')'&& stack.peek()=='(' && stack.isEmpty()!=true){
                stack.pop();
            }else if(expression.charAt(i)==')' && stack.isEmpty()==true)
			{
				return false;
			}
            
        }
        return stack.isEmpty();
    }
}
