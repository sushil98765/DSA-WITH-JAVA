package cristiano.Neymar;
import java.util.*;
public class printall {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//        graph[0].add(new Edge(0, 3));
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 2));
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 1));
//        graph[3].add(new Edge(3, 0));
//        graph[3].add(new Edge(3, 4));
//        graph[4].add(new Edge(4, 3));

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
  }
    public static boolean isCycledirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if (!vis[e.dest]){
                if(isCycledirected(graph,vis ,e.dest,rec)) {
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String[] args){
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create(graph);
        boolean vis []=new boolean[V];
        boolean rec[]=new boolean[V];
        for (int i=0;i<V;i++){
            if(!vis[i]){
                boolean isCycle=isCycledirected(graph,vis ,0,rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
     //   isCycledirected(graph,vis,0,rec);

    }
}

