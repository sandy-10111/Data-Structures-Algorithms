public class Main {
    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public static class DLinkedList {
        Node head;

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;

        }

        public void traverseForward() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public void traverseBack() {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.prev;
            }
            System.out.println("null");

        }

        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);
            if (position == 0) {
                newNode.next = head;
                if (head != null) {
                    head.prev = newNode;
                }
                head = newNode;
                return;
            }
            Node current = head;
            int index = 0;
            while (current != null && index < position - 1) {
                current = current.next;
                index++;
            }
            if (current == null) {
                System.out.println("the position is out of the bounds:(");
                return;
            }

            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;


        }

        public void delete(int data){
            if(head == null){
                System.out.println("the linked list is empty . cannot delete");
                return;
            }
            Node current = head;
            if(current.data == data){
                if(current.next == null){
                    head = null;
                } else{
                    head = current.next;
                    head.prev = null;
                }
                return;
            }
            while (current != null){
                if(current.data == data){
                    current.prev.next = current.next;
                    if(current.next != null){
                        current.next.prev = current.prev;
                    }
                    return;
                }
                current = current.next;
            }
            System.out.println("the data "+ data + "is not found");
        }
    }

        public static void main(String[] args) {

            DLinkedList ll = new DLinkedList();
            ll.append(10);
            ll.append(20);
            ll.append(30);
            ll.append(40);
            ll.traverseForward();
            ll.traverseBack();
            ll.insertAtPosition(5, 0);
            ll.traverseForward();
            ll.insertAtPosition(35, 4);
            ll.traverseForward();
            System.out.println("#####################################");
            ll.delete(70);
            ll.traverseForward();
        }
    }
