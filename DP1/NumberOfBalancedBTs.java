package DP1;

public class NumberOfBalancedBTs {
    
	public static long balancedBTs(long n){
        long height=n;

/* Your class should be named Solution
 * Don't write main().
 * Don't read input, it is passed as function argument.
 * Return output and don't print it.
  * Taking input and printing output is handled automatically.
*/
if(height == 1 || height == 0) return 1;

long h1 = balancedBTs(height-1);
long h2 = balancedBTs(height-2);
int m = (int)Math.pow(10,9) + 7;
long res1 = ((long)h1*h1);
long res2 = ((long)h1*h2*2);

int val1 = (int)(res1%m);
int val2 = (int)(res2%m);

return (val1 + val2)%m;


}
}
