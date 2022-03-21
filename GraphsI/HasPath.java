package GraphsI;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;
import java.util.*;

public class HasPath {
    public static boolean hasPath(int edges[][], int v1, int v2, boolean visited[]){
        // if(edges[v1][v2]==1){
        //     return true;
        // }
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n = edges.length;
        if(v1>=n || v2>=n)
		{
			return false;
		}
		
        visited[v1]=true;
        while(q.size()!=0){
            int front = q.remove();
            
            for(int i =0;i<n;i++){
                if(edges[front][i]==1&&!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        
        }
        if(visited[v2]==true){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][] = new int[V][V];
        s.close();
        for(int i =0; i< E; i++){
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;   
            edges[sv][fv] =1;
        }
        int v1 = s.nextInt();
        int v2= s.nextInt();
        boolean visited []= new boolean[edges.length];
        boolean ans=hasPath(edges,v1,v2,visited);
        System.out.println(ans);
    }
}

