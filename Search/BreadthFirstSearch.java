import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static class Node {
        char value;
        Node[] adjacents;

        Node(){}
        Node(char value){
            this.value = value;
        }
        Node(char value,Node[] adjacents){
            this.value = value;
            this.adjacents = adjacents;
        }
        
        public void setAdjacents(Node[] adjacents){
            this.adjacents = adjacents;
        }
    }

    public static void bfs(Node start){
        Queue<Node> queue = new ArrayDeque<Node>();
        HashSet<Node> seen = new HashSet<Node>();

        queue.add(start);

        while(!queue.isEmpty()){
            Node curr = queue.poll();

            if(!seen.contains(curr)){
                System.out.println(curr.value);
                seen.add(curr);
            }
            for(Node adjacent:curr.adjacents){
                if(!seen.contains(adjacent)){
                    queue.add(adjacent);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        Node nodeG = new Node('G');
        Node nodeH = new Node('H');

        Node[] adjacentsA = {nodeC,nodeE,nodeD};
        nodeA.setAdjacents(adjacentsA);
        Node[] adjacentsB = {nodeC,nodeG};
        nodeB.setAdjacents(adjacentsB);
        Node[] adjacentsC = {nodeA,nodeB,nodeD};
        nodeC.setAdjacents(adjacentsC);
        Node[] adjacentsD = {nodeA,nodeC,nodeE,nodeH};
        nodeD.setAdjacents(adjacentsD);
        Node[] adjacentsE = {nodeA,nodeD,nodeF};
        nodeE.setAdjacents(adjacentsE);
        Node[] adjacentsF = {nodeE,nodeG,nodeH};
        nodeF.setAdjacents(adjacentsF);
        Node[] adjacentsG = {nodeB,nodeF};
        nodeG.setAdjacents(adjacentsG);
        Node[] adjacentsH = {nodeF,nodeD};
        nodeH.setAdjacents(adjacentsH);

        bfs(nodeA);
        return;
    }
}

