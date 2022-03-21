package DP2;

public class EditDistance {
    

    public static int editDistance(String s1, String s2){

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */   
        int m = s1.length();
        int n = s2.length();
        if(m==0 ){
            return n;
        }if(n==0){
            return m;
        }
        // for(int i =0;i<m;i++){
        //     for(int j = 0 ; j<n; j++){
        if(s1.charAt(0)==s2.charAt(0)){
            return editDistance(s1.substring(1), s2.substring(1));
        }else{
            int op1 =  editDistance(s1, s2.substring(1));//insert
            int op2 =  editDistance(s1.substring(1), s2);//delete
            int op3 = editDistance(s1.substring(1),  s2.substring(1));
            return 1+Math.min(op1,Math.min(op2,op3));
        }
        





    }


}
