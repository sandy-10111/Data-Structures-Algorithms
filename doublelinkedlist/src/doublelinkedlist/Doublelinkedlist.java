/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlist;


class Node{
    int data;
    Node prev;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
    class lisss {
        
        Node head;
        
        public void append(int data){
            Node newnode = new Node(data);
            if (head == null){
                head = newnode;
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
            
        }
        public void traverseForward() {
            Node current =head;
            while(current != null){
                System.out.print(current.data +" ->");
                current =current.next;
            }
            System.out.println("null");
        }
        public void traversebackward (){
            Node current =head;
            if(current == null) return;
            
            while(current.next != null){
                current = current.next;
            }
            
            while (current != null){
                System.out.print(current.data +" ->");
                current = current.prev;
            }
            System.out.println("null");
        }
        public void insertAtposition(int data, int pos){
            Node newnode = new Node(data);
            if(pos ==0){
                newnode.next =head;
                if(head !=null){
                    head.prev = newnode;
                }
                head = newnode;
                return;
            }
            Node current =head;
            int index =0;
            while(current != null && index< pos-1){
                current = current.next;
                index++;
            }
            
            if(current ==null){
                System.out.println("this position is out of bounds.");
                return;
            }
            newnode.next =current.next;
            newnode.prev= current;
            if(current.next!= null){
                current.next.prev = newnode;
                current.next =newnode;
            }
            
        }
        public void delete (int data){
            if(head == null){
                System.out.println("list is empty. cannot delete");
                return;
            }
            Node current = head;
            //check if the node to be deleted is the head node
            if(current.data ==data){
                if(current.next == null){
                    head = null;
                }
                else{
                    head = current.next;
                    head.prev = null;
                }
                return;
            }
            //traverse the list to find the node to delete
            while (current != null) {
                if(current.data == data) {
                    //by bass the current node 
                    current.prev.next = current.next;
                    if(current.next != null){
                        current.next.prev = current.prev;
                    }
                    return;
                    
                }
                current = current.next;
            }
            
            System.out.println("value "+ data + " not found");
        }
        
    }
    

/**
 *
 * @author PC
 */
public class Doublelinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     lisss sd = new lisss();
     sd.append(10);
     sd.append(20);
     sd.append(30);
     sd.traverseForward();
     sd.traversebackward();
     sd.insertAtposition(0, 0);
     sd.insertAtposition(25, 3);
     sd.traverseForward();
     sd.delete(20);
     sd.traverseForward();
     sd.delete(75);
     sd.traverseForward();
        
        
        
        
        
    }
    
}
