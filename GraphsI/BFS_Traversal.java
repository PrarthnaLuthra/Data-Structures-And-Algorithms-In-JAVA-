package GraphsI;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;
import java.util.*;

public class BFS_Traversal {
    public static void printBFS(int edges[][], int sv, boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        int n = edges.length;
        visited[sv]=true;
        while(q.size()!=0){
            int front = q.remove();
            System.out.print(front + " ");
            for(int i =0;i<n;i++){
                if(edges[front][i]==1&&!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void BFS(int edges[][]){
        boolean visited []= new boolean[edges.length];
        for(int i=0; i< edges.length; i++){
            if(!visited[i]){
                printBFS(edges,i,visited);
            }
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
        BFS(edges);
    }
}
//     public static void printHelper(int edges[][], int sv,boolean visited[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(sv);
//         visited[sv]=true;
//         while(q.size()!=0){
//             int firstelem = q.remove();
//             System.out.print(firstelem+" ");
//             for(int i=0; i<edges.length; i++){
//                 if(edges[firstelem][i]==1 && !visited[i]){
//                     q.add(i);
//                     visited[i]=true;
//                 }       
//             }
//         }   
//     }
//     // we have to deal with both connected and non connected
//     public static void print(int edges[][]){
//         boolean visited[] = new boolean[edges.length];
//         for(int i=0; i< edges.length; i++){
//             if(!visited[i]){
//                 printHelper(edges, i, visited);   
//             }
//         }
//     }
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 		int V = s.nextInt();
// 		int E = s.nextInt();
//         int edges[][] = new int[V][V];
//         for(int i =0; i< E; i++){
//             int fv = s.nextInt();
//             int sv = s.nextInt();
//             edges[fv][sv] = 1;   
//             edges[sv][fv] =1;
//         }
//         print(edges);
// 	}
// }
