//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(1);
        binaryTree.insert(9);
        binaryTree.insert(3);
        binaryTree.insert(5);

        binaryTree.display();
    }
}