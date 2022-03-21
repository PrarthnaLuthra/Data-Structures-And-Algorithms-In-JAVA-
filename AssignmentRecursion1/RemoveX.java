package AssignmentRecursion1;

public class RemoveX {
    public static String removeX(String input){
		if(input.length()==0){
                return input;
            }
        String temp=removeX(input.substring(1));
        if(input.charAt(0)== 'x'){
            return temp;
        }else{
            return input.charAt(0)+ temp;
        }

	}
}
