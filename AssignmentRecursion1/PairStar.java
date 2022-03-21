package AssignmentRecursion1;

public class PairStar {
    public static String addStars(String s) {
		// Write your code here
        if(s.length()==1){
            return s;
        }
    
        
        String temp =addStars(s.substring(1));
        if(temp.charAt(0)==s.charAt(0)){
            return s.charAt(0)+"*"+temp;
        }
         else{
             return s.charAt(0)+temp;
        
         }
	}
}

        
       