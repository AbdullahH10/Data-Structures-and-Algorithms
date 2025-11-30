package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;

public class BreadthFirstSearch {
    /*
    We are searching for the name in Imaginetown.
    If we find it we return the Node name.
    Otherwise, we return 'Not Found'.
    */
    public static String search(Node begin, String name){
        Queue<Node> queue = new ArrayDeque<>();
        HashSet<Node> visited = new HashSet<>();

        queue.add(begin);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();

            if(currNode.getName().equals(name)){
                return currNode.getName();
            }

            visited.add(currNode);

            for(Node neighbour: currNode.getNeighbours()){
                if(visited.contains(neighbour))
                    continue;
                queue.add(neighbour);
            }
        }

        return "Not Found";
    }
    /*
    Recursive Breadth First Search.
    */
    public static String search(Graph graph, String begin, String name){
        Queue<String> queue = new ArrayDeque<>();
        HashSet<String> visited = new HashSet<>();

        queue.add(begin);

        return search(graph, name, queue, visited);
    }

    private static String search(Graph graph, String name, Queue<String> queue, HashSet<String> visited){
        if(queue.isEmpty()){
            return "Not Found";
        }

        String currValue = queue.poll();

        if(currValue.equals(name)){
            return currValue;
        }

        visited.add(currValue);

        ArrayList<String> adjacencyList = new ArrayList<>(graph.getAdjacencyMap().get(currValue));
        for(String adjacency: adjacencyList){
            if(visited.contains(adjacency))
                continue;
            queue.add(adjacency);
        }

        return search(graph, name, queue, visited);
    }
}
