package Recursion2;

public class ReturnAllCodesString {
    
    public static  String[] getCode(String input){
        if(input.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallAns[] = getCode(input.substring(1));


        int b= input.charAt(0)-'0';
        char code= (char) (b + 'a' -1);
        for(int i =0; i<smallAns.length;i++){
            smallAns[i]= code +smallAns[i];
        }
        String smallans1[]=new String[0];
        if(input.length()>=2)
        {
            int c=input.charAt(0)-'0';
            int d=input.charAt(1)-'0';
            int e=(c*10)+d;

            if(e>=10 && e<=26)
            {char firsttwochar=(char)('a'+e-1);
             smallans1=getCode(input.substring(2));
             for(int i=0;i<smallans1.length;i++){
                 smallans1[i]=firsttwochar+smallans1[i];}
            }
        }
        String output[]= new String[smallAns.length+smallans1.length];
        int k=0;
        for(int i = 0; i<smallAns.length;i++){
            output[k]=smallAns[i];
            k++;
        }
        for(int j =0; j<smallans1.length;j++){
            output[k]=smallans1[j];
            k++;
        }
        return output;


    }

}
