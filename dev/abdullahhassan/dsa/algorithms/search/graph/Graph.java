package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String,List<String>> adjacencyMap;

    public Graph(){
        adjacencyMap = new HashMap<>();
    }

    public Graph(List<Edge> edges){
        adjacencyMap = new HashMap<>();
        createAdjacencyMap(edges);
    }

    public void createAdjacencyMap(List<Edge> edges){
        for(Edge edge: edges){
            String start = edge.getStart();
            String end = edge.getEnd();

            if(adjacencyMap.containsKey(start)){
                adjacencyMap.get(start).add(end);
            }
            else{
                ArrayList<String> neighbors = new ArrayList<>();
                neighbors.add(end);
                adjacencyMap.put(start, neighbors);
            }

            if(adjacencyMap.containsKey(end)){
                adjacencyMap.get(end).add(start);
            }
            else{
                ArrayList<String> neighbors = new ArrayList<>();
                neighbors.add(start);
                adjacencyMap.put(end, neighbors);
            }
        }
    }

    public Map<String,List<String>> getAdjacencyMap(){
        return this.adjacencyMap;
    }
}
