package Recursion2;

public class PrintPermutations {
    public static void FindPermutations(String str) {
        
		// Write your code here
        
         FindPermutations(str,"");
        return;

	}
    public static void FindPermutations(String str,String output) {
		// Write your code here
        if(str.length()==0){
            System.out.println(output);
            return;
        }
        
        for (int i=0;i<str.length();i++){
            FindPermutations(str.substring(0,i)+str.substring(i+1), output+str.charAt(i));
        }return;

	}
    
}

