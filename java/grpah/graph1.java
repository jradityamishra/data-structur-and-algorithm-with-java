import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph1{
    static class edge{
        int src;
        int dest;
        int wt; //agar weighted graph hai too
        public edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<edge>(); //ya empty arraulist ko banat ahi default null tha
        }

        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));

        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,7));

        
        graph[2].add(new edge(2,4,3));
        
        
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,3,2));
        graph[4].add(new edge(4,5,5));



    }
    public static void bfs(ArrayList<edge> graph[],int v,boolean vis[],int start){
        Queue<Integer> q=new LinkedList<>();
         q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.println(curr+' ');
                vis[curr]=true;

                for(int i=0; i<graph[curr].size(); i++){
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){
        System.out.println(curr+"");
        vis[curr]=true;
        for(int i=0; i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
           if(vis[e.dest]==false){
            dfs(graph,e.dest,vis);
           }
        }
    }
    public static void printAllPath(ArrayList<edge> graph[],boolean vis[] ,int curr,String path,int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                vis[curr]=true;
                printAllPath(graph,vis,e.dest,path+e.dest,tar);
                vis[curr]=false;
            }

        }
        
    }
    public static void main(String[] args) {
      int v=7;
    /*
     *       1-----3
     *     /        | \
     *     0        |  5---6
     *     \        | /
     *      2 -----4
     * 
     */
      ArrayList<edge> graph[]=new ArrayList[v];
      createGraph(graph);
        // AGAR DISCONNECT GRAPH HO TO VIS[] MAIN FUNCTION MA HI DEFINE KARENGA
        //agar connected graph ho to vis[] main function mai define nahi karna hai
        // 3---4---5--6
        //      2---3
        boolean vis[]=new boolean[v];
        // for(int i=0; i<v; i++){
        //     if(vis[i]==false){
        //         bfs(graph,v,vis,i);
        //     }
        // }

        // dfs(graph,0,vis);
        // for(int i=0; i<v; i++){
        //         if(vis[i]==false){
        //             dfs(graph,i,vis);
        //         }
        //     }
        // System.out.println();

            int src=0,tar=5;
            printAllPath(graph,new boolean[v],src,"0",tar);

    //   for(int i=0; i<graph[2].size(); i++){
    //     edge e=graph[2].get(i);
    //     System.out.println(e.dest+" "+e.wt);
    //   }
    }
}