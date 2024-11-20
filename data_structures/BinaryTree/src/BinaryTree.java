public class BinaryTree {

    private Node root;

    public void insert(int data) {
        this.root = insertHelper(this.root, data);
    }
    private Node insertHelper(Node root, int data) {
        // Base case when tree is empty
        if (root == null) {
            return new Node(data);
        }

        // when data in new node is smaller than data in root
        if (data < root.getData()) {
            root.setLeft(insertHelper(root.getLeft(), data));
        // when data in new node is larger than data in root
        } else if (data > root.getData()) {
            root.setRight(insertHelper(root.getRight(), data ));
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }
    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.getLeft());
            System.out.print(root.getData() + " ");
            displayHelper(root.getRight());
        }
    }

    public boolean search(int data) {
        return searchHelper(this.root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.getData()) {
            return true;
        }else if (data < root.getData()) {
            return searchHelper(root.getLeft(), data);
        }else {
            return searchHelper(root.getRight(), data);
        }
    }
}
