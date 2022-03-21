package Recursion2;

public class PrintAllCodesString {
    public static void printAllPossibleCodes(String input) {
        printAllPossibleCodes(input,"");
       return;

   }
   public static void printAllPossibleCodes(String input, String output) {
       // Write your code here
       if(input.length()==0){
           System.out.println(output);
           return;
       }
       int an = input.charAt(0)-'0';
       char first= (char)('a'+ an -1);
       // String outputSoFar = first;
       printAllPossibleCodes(input.substring(1), output+first);
       if(input.length()>=2)
       {
           int c=input.charAt(0)-'0';
           int d=input.charAt(1)-'0';
           int e=(c*10)+d;

           if(e>=10 && e<=26)
           {char firsttwochar=(char)('a'+e-1);
            printAllPossibleCodes(input.substring(2),output+firsttwochar);
           }
       }
           
       
       
       
   return;
   }
}

