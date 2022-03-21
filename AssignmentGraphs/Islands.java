package AssignmentGraphs;

public class Islands {
    
	public static int numConnected(int[][] edges, int n) {
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         
        */
        boolean[] visited = new boolean[ edges.length ];
		int count=0;
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				DFS( edges, visited,i );
				count++;
			}
		}
        
        
		return count;
		
	}
	
    public static void  DFS(int[][] edges,boolean[] visited,int startver){
        // int n = edges.length;
        
        visited[startver]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[startver][i]==1 && visited[i]==false){
                visited[i]=true;
                DFS(edges,visited,i);

            }
        }
        
    }
}

	
		

