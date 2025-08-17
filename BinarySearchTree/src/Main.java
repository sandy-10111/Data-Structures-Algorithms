import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(10));
        tree.insert(new Node(8));
        tree.insert(new Node(1));
        tree.insert(new Node(5));
        tree.insert(new Node(12));
        tree.insert(new Node(15));
        tree.insert(new Node(7));
        tree.display();
        tree.remove(8);
        System.out.println("*******************************************");
        tree.display();
        tree.remove(0);
        System.out.println(tree.search(10));
    }
}