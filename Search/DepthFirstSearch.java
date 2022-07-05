import java.util.HashSet;
import java.util.Stack;

public class DepthFirstSearch {
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

    public static void dfs(Node start){
        Stack<Node> stack = new Stack<Node>();
        HashSet<Node> seen = new HashSet<Node>();

        stack.push(start);

        while(!stack.isEmpty()){
            Node curr = stack.pop();

            if(!seen.contains(curr)){
                System.out.println(curr.value);
                seen.add(curr);
            }
            for(Node adjacent:curr.adjacents){
                if(!seen.contains(adjacent)){
                    stack.push(adjacent);
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

        dfs(nodeA);
        return;
    }
}
