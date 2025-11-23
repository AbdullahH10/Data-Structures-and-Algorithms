import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

class Node {
    private int value;
    private Node[] adjacents;

    Node() {}

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node[] adjacents) {
        this.value = value;
        this.adjacents = adjacents;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAdjacents(Node[] adjacents) {
        this.adjacents = adjacents;
    }

    public int getValue() {
        return this.value;
    }

    public Node[] getAdjacents() {
        return this.adjacents;
    }
}

class BreadthFirstSearch {
    public boolean search(Node start, int key) {
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
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        Node[] adjacents1 = { node3, node5, node4 };
        node1.setAdjacents(adjacents1);
        Node[] adjacents2 = { node3, node7 };
        node2.setAdjacents(adjacents2);
        Node[] adjacents3 = { node1, node2, node4 };
        node3.setAdjacents(adjacents3);
        Node[] adjacents4 = { node1, node3, node5, node8 };
        node4.setAdjacents(adjacents4);
        Node[] adjacents5 = { node1, node4, node6 };
        node5.setAdjacents(adjacents5);
        Node[] adjacents6 = { node5, node7, node8 };
        node6.setAdjacents(adjacents6);
        Node[] adjacents7 = { node2, node6 };
        node7.setAdjacents(adjacents7);
        Node[] adjacents8 = { node6, node4 };
        node8.setAdjacents(adjacents8);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        boolean result = bfs.search(node1,8);
        System.out.println("Found:"+result);
        return;
    }
}
