package Recursion1;

public class PrintNumbers {
    public static void print(int n){
		if(n == 0){
			return;
		}
		// System.out.print(n+" ");
		print(n - 1);
        System.out.print(n+ " ");
	}

}
