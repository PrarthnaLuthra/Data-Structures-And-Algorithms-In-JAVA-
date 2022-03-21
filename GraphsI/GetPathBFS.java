package GraphsI;
import java.util.*;
import java.io.IOException;

public class GetPathBFS {
    
    public static void main(String[] args)  throws NumberFormatException, IOException{
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
        ArrayList<Integer> ans=getPathBFS(edges,visited,v1,v2);
        if(ans!=null){
            for(int elem:ans)
            {
                System.out.print(elem+" ");
            }
        }
    }
    public static ArrayList <Integer> getPathBFS(int edges[][],boolean visited[],int v1,int v2){
        ArrayList<Integer> ans = new ArrayList<>();
        if(v1==v2){
            visited [v1]= true;
            ans.add(v1);
            return ans;
        }
        visited [v1]= true;
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        q.add(v1);
        int n = edges.length;

        while(q.size()!=0){
            int front = q.remove();


            for(int i =0;i<n;i++){
                if(edges[front][i]==1&&!visited[i]){
                    q.add(i);
                    h.put(i,front);
                    visited[i]=true;
                    if(i==v2)
                    {    ans.add(i); 
                     while(!ans.contains(v1)){

                         int b=h.get(i);
                         ans.add(b);
                         i=b;
                     }
                     return ans;
                    }
                }
            }
        }
        return null;
    }
}
