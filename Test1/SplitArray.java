package Test1;

public class SplitArray {
    public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArray(input,0,0,0);
	}
    public static boolean splitArray(int input[], int si, int lefts, int rights) {
		if(input.length==si){
            return lefts==rights;
        }
         if(input[si]%5==0){
             lefts+=input[si];
         }
        else if(input[si]%3==0){
             rights+=input[si];
         }
        else{
            return splitArray(input,si+1,lefts+input[si],rights)||splitArray(input,si+1,lefts,rights+input[si]);
        }
		
        return splitArray(input,si+1,lefts,rights);
	}
	

}
