package AssignmentGraphs;

public class LargestPiece {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static int dfs(String[] edge, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        boolean[][] visited = new boolean[n][n];
		int max = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(!visited[i][j] && edge[i].charAt(j)=='1' ){
					int ans = max1s(  edge,visited,i,j,n);
					if(max <ans){
						max = ans;
					}
				}
			}
		}
		return max;
	}



// public static int solve(int n,String cake[]) {
// 		boolean[][] visited = new boolean[n][n];
// 		int max = 0;
// 		for(int i=0;i<n;i++){
// 			for(int j=0;j<n;j++){
// 				if(!visited[i][j] && cake[i].charAt(j)=='1' ){
// 					int ans = max1s( cake,visited,i,j,n);
// 					if(max <ans){
// 						max = ans;
// 					}
// 				}
// 			}
// 		}
// 		return max;
// 	}

	public static int max1s(String[] cake,boolean[][] visited,int x,int y,int n){




		int[] X_dir = {0,1,-1,0};
		int[] Y_dir = {1,0,0,-1};
		int max = 0;
		visited[x][y] = true;
		for(int i=0;i<X_dir.length;i++){

			int a = X_dir[i] +x;
			int b = Y_dir[i] + y;

			if(a>=0 && b>=0 && a<n &&
					b<n && cake[a].charAt(b) =='1' 
					&& !visited[a][b] ){

				int ans = max1s(cake,visited, a,b,n);
				max = max + ans;

			}


		}
		return max + 1;


	}


}