package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.HashSet;
import java.util.Stack;

public class DepthFirstSearch {
    /*
    We are searching for the name in Imaginetown.
    If we find it we return the Node.
    Otherwise, we return null.
    */
    public static Node search(Node begin, String name){
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();
        
        stack.add(begin);

        while(!stack.isEmpty()){
            Node currNode = stack.pop();

            if(currNode.getName().equals(name)){
                return currNode;
            }

            visited.add(currNode);

            for(Node neighbour: currNode.getNeighbours()){
                if(visited.contains(neighbour))
                    continue;
                stack.add(neighbour);
            }
        }

        return null;
    }
}
