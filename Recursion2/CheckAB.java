package Recursion2;

public class CheckAB {
    
    public static boolean checkAB(String input) {
        if(input.length()==0){
            return true;
        }
        boolean smallAns=true;
        if (input.charAt(0)=='a'){
            if(input.length()>2  &&(input.charAt(1)=='b'&& input.charAt(2)=='b')){
                smallAns=checkAB(input.substring(3));
        
            }else{
                smallAns=checkAB(input.substring(1));
            }
        

        } else{
            smallAns= false;
        }
       return smallAns;
    }
}
   