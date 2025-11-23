import java.util.ArrayList;
import java.util.List;

class Graph {
    List<List<Integer>> adjList;

    //List of edges and n is total number of nodes
    Graph(Edge[] edges, int n) {
        adjList = new ArrayList<>(n);
        for(int i=0;i<=n;i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for(Edge edge: edges) {
            int source = edge.source;
            int dest = edge.dest;

            adjList.get(source).add(dest);
            adjList.get(dest).add(source);
        }
    }
}
