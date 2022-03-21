package GraphsII;

import java.util.Scanner;

public class PrimsAlgorithm {
    public static void prims(int adjMatrix[][]){
        int v= adjMatrix.length;
        boolean visited[]= new boolean[v];
        int parent[]= new int[v];
        int weight[] = new int[v];
        weight[0]=0;
        parent[0]=-1;
        for (int i = 1; i<v;i++){
            weight[i]=Integer.MAX_VALUE;
        }
        for(int i =0;i<v;i++){
            int vertex =findMinVertex(weight, visited);
            visited[vertex]= true;
            //explore its unvisited neighbours
            for(int j =0;j<v;j++){
                if(adjMatrix[vertex][j]!=0 && !visited[j]){
                    if(adjMatrix[vertex][j]<weight[j]){
                        weight[j]=adjMatrix[vertex][j];
                        parent[j]= vertex;
                    }
                }
            }
        }
      
		
        for(int i =1;i<v;i++){
            if(parent[i] < i){
                System.out.println(parent[i] + " "+ i +" "+ weight[i]);
            }else{
                System.out.println(i + " "+ parent[i] +" "+ weight[i]);
            }
        }

    }
    private static int findMinVertex(int weight[],boolean visited[]){
        int minVertex =-1;
        for(int i = 0;i<weight.length;i++){
            if(!visited[i]&& (minVertex==-1||weight[i]<weight[minVertex])){
                minVertex = i;
            }
           


        } return minVertex;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int adjMatrix [][]=new int[V][V];
        s.close();
        for(int i = 0;i<E;i++){
            int v1=s.nextInt();
            int v2=s.nextInt();
            int w = s.nextInt();
            adjMatrix [v1][v2]=w;
            adjMatrix [v2][v1]=w;

        }
        prims(adjMatrix);

        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        // boolean visited[] = new boolean[V-1];
    }
}