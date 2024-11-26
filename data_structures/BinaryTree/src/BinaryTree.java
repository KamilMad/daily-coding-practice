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

    public void delete(int data) {
        deleteHelper(this.root, data);
    }

    public Node deleteHelper(Node root, int data) {
        if (root == null) {
            return root; //Find why. Maybe because if is null then return null and if not then just return the value
        }

        if (data < root.getData()) {
            root.setLeft(deleteHelper(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(deleteHelper(root.getRight(), data));
        } else {

            if (root.getLeft() == null && root.getRight() == null) { // node have no children then return null
                return null;
            } else if (root.getLeft() == null){ // node have only right child then return it (node with be replaced with its right child)
                return root.getRight();
            } else if (root.getRight() == null){ // node have only left child then return it (node will be replaced with its left child)
                return root.getLeft();
            } else { // node have both children
                Node successor = getSuccessor(root.getRight());
                root.setData(successor.getData());
                root.setRight(deleteHelper(root.getRight(), successor.getData()));
            }
        }
        return root;
    }

    private Node getSuccessor(Node root) {
        while (root.getLeft() != null ){
            root = root.getLeft();
        }
        return root;
    }

    private Node findMin(Node root) {
        if (root.getLeft() == null) {
            return root;
        }
        return findMin(root.getLeft());
    }
}
