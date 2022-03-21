package Recursion1;

public class CheckPalindromeRecursive {
    
	private static boolean isStringPalindrome(String input, int si, int ei) {
        if(input.length()<=1){
            return true;
        }
        if(input.charAt(si)!=input.charAt(ei)){
            return false;
        }
        if(si<ei+1){
        boolean smallAns=isStringPalindrome(input,si+1,ei-1);
        return smallAns;
        }
        return true;

	}
    public static boolean isStringPalindrome(String input) {
        
        
        int n = input.length();
        if(n==0){
            return true;
        }
		return isStringPalindrome(input, 0, n-1);

	}
}

