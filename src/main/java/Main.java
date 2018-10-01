import models.Node;

public class Main {
    public static void main(String[] args) {
        Node first = new Node(2);
        Node second = new Node(7);
        Node third = new Node(2);
        Node fourth = new Node(6);
        Node fifth = new Node(5);
        Node sixth = new Node(11);
        Node seventh = new Node(5);
        Node eighth = new Node(9);
        Node ninth = new Node(4);

        eighth.setLeft(ninth);

        seventh.setRight(eighth);

        fourth.setLeft(fifth);
        fourth.setRight(sixth);

        second.setLeft(third);
        second.setRight(fourth);

        first.setLeft(second);
        first.setRight(seventh);

        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.println("Pre order");
        treeTraversal.preOrder(first);
        System.out.println("In order");
        treeTraversal.inOrder(first);
        System.out.println("Post order");
        treeTraversal.postOrder(first);
    }
}
