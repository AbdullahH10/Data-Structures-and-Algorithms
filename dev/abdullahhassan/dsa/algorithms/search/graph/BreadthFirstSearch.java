package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class BreadthFirstSearch {
    /*
    We are searching for the name in Imaginetown.
    If we find it we return the Node.
    Otherwise, we return null.
    */
    public static Node search(Node begin, String name){
        Queue<Node> queue = new ArrayDeque<>();
        HashSet<Node> visited = new HashSet<>();

        queue.add(begin);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();

            if(currNode.getName().equals(name)){
                return currNode;
            }

            visited.add(currNode);

            for(Node neighbour: currNode.getNeighbours()){
                if(visited.contains(neighbour))
                    continue;
                queue.add(neighbour);
            }
        }

        return null;
    }
}
