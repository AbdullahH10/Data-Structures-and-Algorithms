package dev.abdullahhassan.dsa.algorithms.search.graph;

public class Edge {
    private String start;
    private String end;

    public Edge(){}

    public Edge(String start, String end){
        setStart(start);
        setEnd(end);
    }

    public void setStart(String start){
        this.start = start;
    }

    public void setEnd(String end){
        this.end = end;
    }

    public String getStart(){
        return this.start;
    }

    public String getEnd(){
        return this.end;
    }
}
