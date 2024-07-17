package cristiano.Neymar;
import java.util.*;


public class graph {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s, int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
public static void creategraph( ArrayList<Edge> grap[]){
    for(int i=0; i<grap.length;i++){
        grap[i]=new ArrayList<Edge>();
    }
    grap[0].add(new Edge(0,2,2));
    grap[1].add(new Edge(1,2,10));
    grap[1].add(new Edge(1,3,0));
    grap[2].add(new Edge(2,0,2));
    grap[2].add(new Edge(2,1,10));
    grap[2].add(new Edge(2,3,-1));
    grap[3].add(new Edge(3,1,0));
    grap[3].add(new Edge(3,2,-1));

}


    public static void main(String[]args ){
        int  V=4;
        ArrayList<Edge> grap[]=new ArrayList[V];
        creategraph(grap);
        
        for (int i=0; i<grap[2].size(); i++){
            Edge e= grap[2].get(i);
            System.out.println(e.dest+"," +e.weight);

        }

    }
    
}
