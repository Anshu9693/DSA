import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {
    int src;
    int dest;

    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

public class A2_BFS_DISCONNEC {

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void BFS(ArrayList<Edge> graph[], int v,boolean visit[],int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visit[curr] == false) {
                System.out.println(curr + " ");
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }

        }
    }

    public static void main(String[] args) {
        System.out.println("This is A1_BFS class");
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean visit[] = new boolean[v];

        for(int i =0;i<visit.length;i++){
            if(visit[i]==false){
                BFS(graph, v, visit, i);
            }
        }







        // for (int i = 0; i < graph[3].size(); i++) {
        // Edge e = graph[3].get(i);
        // System.out.println(e.dest);
        // }

    }
}
