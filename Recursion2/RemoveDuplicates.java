package Recursion2;

public class RemoveDuplicates {
    
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length()<=1){
            return s;
        }

        String temp =removeConsecutiveDuplicates(s.substring(1));

        if(s.charAt(0)==temp.charAt(0)){
            return temp;
        }else{
            return s.charAt(0)+temp;
        }

    }

}
