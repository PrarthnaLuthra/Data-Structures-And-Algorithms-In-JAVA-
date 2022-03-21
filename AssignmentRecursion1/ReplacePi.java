package AssignmentRecursion1;

public class ReplacePi {
    // Return the changed string
	public static String replace(String input){
        if(input.length()<=1){
            return input;
        }
    String temp=replace(input.substring(1));
    if(input.charAt(0)=='p'&& temp.charAt(0)=='i'){
        return"3.14"+temp.substring(1);
    }else{
        return input.charAt(0)+temp;
    }
    // Write your code here

}
}
