package GraphsI;

import java.io.IOException;
import java.util.*;

public class GetPathDFS {
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        /* Write Your Code Here
        			 * Complete the Rest of the Program
        			 * You have to take input and print the output yourself
        			 */

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
         boolean visited[]=new boolean[V];
        ArrayList<Integer> ans=getPathDFS(edges,visited,v1,v2);
        if(ans!=null){
        for(int elem:ans)
        {
            System.out.print(elem+" ");
        }
    }
    }
    public static ArrayList<Integer> getPathDFS(int edges[][],boolean visited[],int v1,int v2){
        ArrayList<Integer> ans = new ArrayList<>();
        if(v1==v2){
            visited [v1]= true;
            ans.add(v1);
            return ans;
        }
        visited [v1]= true;
        for(int i =0; i<edges.length;i++){
            if(edges[v1][i]==1 && !visited[i])
            { 
                ArrayList<Integer> arr=getPathDFS(edges,visited,i,v2); 
                if(arr!=null)
                {
                    arr.add(v1);

                    return arr;
                }
            }

        }return null;
    }
}
