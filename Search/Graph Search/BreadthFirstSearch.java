import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

class Node {
    private char value;
    private Node[] adjacents;

    Node() {
    }

    Node(char value) {
        this.value = value;
    }

    Node(char value, Node[] adjacents) {
        this.value = value;
        this.adjacents = adjacents;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public void setAdjacents(Node[] adjacents) {
        this.adjacents = adjacents;
    }

    public char getValue() {
        return this.value;
    }

    public Node[] getAdjacents() {
        return this.adjacents;
    }
}

class BreadthFirstSearch {
    public boolean search(Node start, char key) {
        Queue<Node> queue = new ArrayDeque<Node>();
        HashSet<Node> seen = new HashSet<Node>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (!seen.contains(curr)) {
                System.out.println("Seen:" + curr.getValue());
                seen.add(curr);
                if (curr.getValue() == key) {
                    return true;
                }
            }

            for (Node adjacent : curr.getAdjacents()) {
                if (!seen.contains(adjacent)) {
                    queue.add(adjacent);
                }
            }
        }

        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        Node nodeG = new Node('G');
        Node nodeH = new Node('H');

        Node[] adjacentsA = { nodeC, nodeE, nodeD };
        nodeA.setAdjacents(adjacentsA);
        Node[] adjacentsB = { nodeC, nodeG };
        nodeB.setAdjacents(adjacentsB);
        Node[] adjacentsC = { nodeA, nodeB, nodeD };
        nodeC.setAdjacents(adjacentsC);
        Node[] adjacentsD = { nodeA, nodeC, nodeE, nodeH };
        nodeD.setAdjacents(adjacentsD);
        Node[] adjacentsE = { nodeA, nodeD, nodeF };
        nodeE.setAdjacents(adjacentsE);
        Node[] adjacentsF = { nodeE, nodeG, nodeH };
        nodeF.setAdjacents(adjacentsF);
        Node[] adjacentsG = { nodeB, nodeF };
        nodeG.setAdjacents(adjacentsG);
        Node[] adjacentsH = { nodeF, nodeD };
        nodeH.setAdjacents(adjacentsH);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        boolean result = bfs.search(nodeA,'H');
        System.out.println("Found:"+result);
        return;
    }
}
