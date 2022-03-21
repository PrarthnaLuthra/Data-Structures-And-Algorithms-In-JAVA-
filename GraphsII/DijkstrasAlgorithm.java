package GraphsII;

import java.util.Scanner;

public class DijkstrasAlgorithm {
    private static void dijkstra(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		distance[0] = 0;
		for(int i = 1; i < v; i++){
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < v - 1; i++){
			// Find Vertex with Min distance
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			// Explore neighbors
			for(int j = 0; j < v; j++){
				if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
					int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
					if(newDist < distance[j]){
						distance[j] = newDist;
					}
				}
			}
		}
		
		// Print
		for(int i = 0; i < v; i++){
			System.out.println(i + " "+ distance[i]);
		}
		
	}
		
private static int findMinVertex(int[] distance, boolean visited[]) {
		
		int minVertex = -1;
		for(int i = 0; i < distance.length; i++){
			if(!visited[i]  && (minVertex == -1 || distance[i] < distance[minVertex])){
				minVertex = i;
			}
		}
		return minVertex;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
        s.close();
		for(int i = 0; i < e; i++){
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}
		dijkstra(adjacencyMatrix);
    }
}
//     public static void dijkstra(int adjMatrix[][] ){
//         int v = adjMatrix.length;
//         boolean visited[] = new boolean[v];
//         int distance[] = new int[v];
//         distance[0]=0;
//         for(int i =1;i<distance.length;i++){
//             distance[i]= Integer.MAX_VALUE;
            
//         }
//         for(int i =0 ; i<v;i++){
//             int minVertex= findMinVertex(distance,visited);
//             for(int j =0;j<v;j++){
//                 if(adjMatrix[minVertex][j]!=0&& !visited[j]&& distance[minVertex]!= Integer.MAX_VALUE){
//                     int newDistance =distance[minVertex]+adjMatrix[minVertex][j];
//                     if(newDistance<distance[j]){
//                         distance[j]= newDistance;
//                     }
//                 }
//             }
            
//         }
//        for(int i = 0; i < v; i++){
// 			System.out.println(i + " "+ distance[i]);
// 		}
//     }
//     private static int findMinVertex(int distance[],boolean visited[]){
//         int minVertex =-1;
//         visited[minVertex]=true;
//         for(int i = 0;i<distance.length;i++){
//             if(!visited[i]&& (minVertex==-1||distance[i]<distance[minVertex])){
//                 minVertex = i;
//             }
           
//         } return minVertex;
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int V = s.nextInt();
//         int E = s.nextInt();
//         int adjMatrix [][]=new int[V][V];
//         for(int i = 0;i<E;i++){
//             int v1=s.nextInt();
//             int v2=s.nextInt();
//             int w = s.nextInt();
//             adjMatrix [v1][v2]=w;
//             adjMatrix [v2][v1]=w;

//         }
//         dijkstra(adjMatrix);

//         /* Write Your Code Here
// 		 * Complete the Rest of the Program
// 		 * You have to take input and print the output yourself
// 		 */
//         // boolean visited[] = new boolean[V-1];
//     }
// }