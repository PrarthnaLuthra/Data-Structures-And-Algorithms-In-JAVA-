package Test1;

public class DoesScontainT {
    public static boolean checkSequence(String a, String b) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */


        return checkSequence(a,b,0,0);


    }
    public static boolean checkSequence(String a, String b, int ai, int bi) {

        if(b.length()==bi){
            return true;
        }
        if(a.length()==ai){
            return false;
        }
        
        if(b.charAt(bi)==a.charAt(ai)){
            return checkSequence( a, b, ai+1,  bi+1);
        }else{
            return checkSequence( a, b, ai+1,  bi);
        }
    }

}

