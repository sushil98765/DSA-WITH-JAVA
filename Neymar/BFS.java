package cristiano.Neymar;
import java.util.*;
import java.uitl.Integer;



public class BFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;

        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));


    }
public static void bfs(ArrayList<Edge> graph[],int V){
    Queue<Integer> q= new LinkedList<>();
    
    boolean visited[]=new boolean[V];
  //Queue<Integer> q=new LinkedList<>();

    q.add(0);
    while(!q.isEmpty()){
        int curr=q.remove();
        if(visited[curr]==false){
            System.out.println(curr+" ");
            visited[curr] =true;
            for (int i=0; i<graph[curr].size();i++){
                Edge e= graph[curr].get(i);
                q.add(e.dest);

            }

        }

    }
    System.out.println(" ");

}

    public static void main(String[] args){
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);
        bfs(graph,V);


    }
    
}
