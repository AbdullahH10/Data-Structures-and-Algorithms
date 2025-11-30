package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch {
    /*
    We are searching for the name in Imaginetown.
    If we find it we return the Node name.
    Otherwise, we return null.
    */
    public static String search(Node begin, String name){
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();
        
        stack.add(begin);

        while(!stack.isEmpty()){
            Node currNode = stack.pop();

            if(currNode.getName().equals(name)){
                return currNode.getName();
            }

            visited.add(currNode);

            for(Node neighbour: currNode.getNeighbours()){
                if(visited.contains(neighbour))
                    continue;
                stack.add(neighbour);
            }
        }

        return "Not Found";
    }
    /*
    Recursive Depth First Search.
    */
    public static String search(Graph graph, String begin, String name){
        Stack<String> stack = new Stack<>();
        HashSet<String> visited = new HashSet<>();

        stack.add(begin);

        return search(graph, name, stack, visited);
    }

    private static String search(Graph graph, String name, Stack<String> stack, HashSet<String> visited){
        if(stack.isEmpty()){
            return "Not Found";
        }

        String currValue = stack.pop();

        if(currValue.equals(name)){
            return currValue;
        }

        visited.add(currValue);

        ArrayList<String> adjacencyList = new ArrayList<>(graph.getAdjacencyMap().get(currValue));
        for(String adjacency: adjacencyList){
            if(visited.contains(adjacency))
                continue;
            stack.add(adjacency);
        }

        return search(graph, name, stack, visited);
    }
}
