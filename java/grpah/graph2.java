import java.util.ArrayList;
import java.util.PriorityQueue;

class graph2{
    /**
     * Innergraph2
     */
    static class Edge {
    int src;
    int dest;
    int wt;

     Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt=wt;
     }
        
    }
     public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>(); //ya empty arraulist ko banat ahi default null tha
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        
        graph[2].add(new Edge(2,4,3));
        
        
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));



    }

    // SORTEST PATH USING DIJKSTRA ALGORITHM

    public static class pair implements Comparable<pair>{
        int node;
        int dist;
        public pair(int n,int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(pair p2){
            return this.dist-p2.dist; //ascending order
            // return p2.dist-this.dist; 
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src,int v){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int dist[]=new int[v];
        for(int i=0; i<v; i++){
            if(i!=src){
                // i sorce ka equal nhi hoga to
                // jaha source nhi hai waha distance of i ko infifnity rakh denga
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[v];
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
             pair curr=pq.remove(); 
            if(!vis[curr.node]){
                vis[curr.node]=true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int V=e.dest;
                    if(dist[u]+e.wt<dist[V]){
                        dist[V]=dist[u]+e.wt;
                        pq.add(new pair(V,dist[V]));
                    }
                }
            }
        }
        for(int i=0; i<v; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int v=6;

        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        dijkstra(graph, 0, v);
    }
}