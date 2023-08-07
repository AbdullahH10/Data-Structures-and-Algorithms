import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public class RecursiveBreadthFirstSearch {
    public static void rbfs(Graph graph, Queue<Integer> q, HashSet<Integer> seen){
        if(q.isEmpty()){
            return;
        }
        
        int cur = q.poll();
        if(!seen.contains(cur)){
            System.out.print(cur+" ");
            seen.add(cur);
        }

        List<Integer> adjacencies = graph.adjList.get(cur);
        for(int adj: adjacencies){
            if(!seen.contains(adj)){
                q.add(adj);
            }
        }

        rbfs(graph, q, seen);
    }

    public static void main(String[] args) {
        int n = 8;
        Edge[] edges = {
            new Edge(1, 4),
            new Edge(1, 3),
            new Edge(1, 5),
            new Edge(5, 6),
            new Edge(6, 8),
            new Edge(8, 4),
            new Edge(4, 5),
            new Edge(4, 3),
            new Edge(7, 6),
            new Edge(7, 2),
            new Edge(2, 3)
        };
        Graph graph = new Graph(edges, n);
        HashSet<Integer> seen = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);

        rbfs(graph,q,seen);

        return;
    }
}
