package cristiano.Neymar;
import java.util.*;

public class Cycle {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void create( ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
        }
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));
        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));
        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));
        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));
        // graph[4].add(new Edge(4, 3));

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

}
public static boolean cycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){

    vis[curr]=true;
    rec[curr]=true;
    for (int i=0; i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(rec[e.dest]){
            return true;

        }
        else if(!vis[e.dest]){
            if(cycle(graph,e.dest,vis,rec)){
                return true;
            }
        }
        rec[curr]=false;
        return false;

        
    }
}





    public static void main(String[] args){
        int V=4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        create(graph);

        System.out.println(graph,new boolean[V],0,new boolean[V]);
    }
}