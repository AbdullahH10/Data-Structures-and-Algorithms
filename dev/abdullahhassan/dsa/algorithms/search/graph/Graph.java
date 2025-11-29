package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String,List<String>> adjacencies;

    public Graph(){
        adjacencies = new HashMap<>();
    }

    public Graph(List<Edge> edges){
        adjacencies = new HashMap<>();
        createAdjacencyList(edges);
    }

    public void createAdjacencyList(List<Edge> edges){
        for(Edge edge: edges){
            String start = edge.getStart();
            String end = edge.getEnd();

            if(adjacencies.containsKey(start)){
                adjacencies.get(start).add(end);
            }
            else{
                ArrayList<String> neighbors = new ArrayList<>();
                neighbors.add(end);
                adjacencies.put(start, neighbors);
            }

            if(adjacencies.containsKey(end)){
                adjacencies.get(end).add(start);
            }
            else{
                ArrayList<String> neighbors = new ArrayList<>();
                neighbors.add(start);
                adjacencies.put(end, neighbors);
            }
        }
    }

    public Map<String,List<String>> getAdjacencyList(){
        return this.adjacencies;
    }
}
