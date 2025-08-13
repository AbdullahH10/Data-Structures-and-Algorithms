import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class RecursiveDepthFirstSearch {
    public static void rdfs(Graph graph, Stack<Integer> stack, HashSet<Integer> seen) {
        if(stack.isEmpty()) return;
        
        int cur = stack.pop();

        if(!seen.contains(cur)){
            System.out.print(cur+" ");
            seen.add(cur);
        }

        List<Integer> adjacencies = graph.adjList.get(cur);
        for(int adj: adjacencies){
            if(!seen.contains(adj)){
                stack.push(adj);
            }
        }

        rdfs(graph, stack, seen);

        return;
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
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        rdfs(graph,stack,seen);

        return;
    }
}
