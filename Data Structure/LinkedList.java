class Node{
    int value;
    Node next = null;

    Node(int val){
        value = val;
    }
    Node(int val, Node nextNode){
        value = val;
        next = nextNode;
    }
}

public class LinkedList {
    // head = head or start of the Linked List.
    // insertNode = the node that needs to be started in the Linked List
    public static void insert(Node head, Node insertNode) {
        while(head.next != null){
            head = head.next;
        }

        head.next = insertNode;
        return;
    }

    public static Node search(Node head, int key) {
        while(head.next != null){
            if(head.value == key) return head;
            head = head.next;
        }

        return head.next;
    }

    public static void delete(Node head, Node deleteNode) {
        if(head.value == deleteNode.value) {
            head = null;
        }
        while(head.next != null) {
            if(head.next.value == deleteNode.value){
                head.next = deleteNode.next;
                deleteNode = null;
            }
        }

        return;
    }
    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        insert(n1, n2);
        insert(n1, n3);
        insert(n1, n4);
        insert(n1, n5);

        System.out.println(search(n1, 3));
    }
}
