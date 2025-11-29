package dev.abdullahhassan.dsa.algorithms.search.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<Node> neighbours;

    public Node(){}

    public Node(String name){
        setName(name);
        this.neighbours = new ArrayList<>();
    }

    public Node(String name, List<Node> neighbours){
        setName(name);
        setNeighbours(neighbours);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNeighbours(List<Node> neighbours){
        this.neighbours = neighbours;
    }

    public String getName(){
        return this.name;
    }

    public List<Node> getNeighbours(){
        return this.neighbours;
    }
}
