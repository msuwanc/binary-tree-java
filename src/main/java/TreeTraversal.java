import models.Node;

public class TreeTraversal {
    public void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.getValue());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void inOrder(Node root) {
        if(root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getValue());
            inOrder(root.getRight());
        }
    }

    public void postOrder(Node root) {
        if(root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getValue());
        }
    }
}
