import java.util.ArrayList;

class Edge {
    int src;
    int dest;

    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

public class Implementation {

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 2));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void main(String[] args) {

        ArrayList<Edge> grap[] = new ArrayList[4];
        createGraph(grap);

        for (int i = 0; i < grap[2].size(); i++) {
            Edge e = grap[2].get(i);
            System.out.println(e.dest);
        }

    }

}
