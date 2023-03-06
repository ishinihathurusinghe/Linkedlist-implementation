                       public class LinkedList{
    public static void main(String arg[]){
        ListNode l1 = new ListNode();
        l1.front(20);
        l1.front(30);
        l1.front(40);
        l1.front(50);
       // l1.display();
        l1.rear(80);
        l1.insertNodeAtPosition(100,3);
        l1.display();
    }
}

// we can create linked list with values using this method you can add elements to front as well as display

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

class ListNode{
    Node head;
    Node tail;

    public ListNode(){
        head=tail=null;
    }

    public void front(int nw_data){
        Node nw_node = new Node(nw_data);
        nw_node.next = head;
        head = nw_node;
    }

    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void rear(int new_data){
        Node nw_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        nw_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = nw_node;
        return;
    }

    public void insertNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            for (int i = 1; i < position - 1; i++) {
                if (prev.next == null) {
                    throw new IllegalArgumentException("Invalid position");
                }
                prev = prev.next;
            }

            newNode.next = prev.next;
            prev.next = newNode;
        }
    }



}
