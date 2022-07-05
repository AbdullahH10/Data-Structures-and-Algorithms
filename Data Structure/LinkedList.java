public class LinkedList {
    
    public static class ListNode{
        int value;
        ListNode next = null;

        ListNode(int val){
            value = val;
        }
        ListNode(int val, ListNode nextNode){
            value = val;
            next = nextNode;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(10);
        ListNode node3 = new ListNode(15);

        node1.next = node2;
        node2.next = node3;

        ListNode node = node1;

        while(node != null){
            System.out.print(node.value+" ");
            node = node.next;
        }
    }
}
