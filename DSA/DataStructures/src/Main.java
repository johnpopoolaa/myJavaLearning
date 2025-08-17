import com.acmetech.tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // add data to the tree
        tree.insert(5);
        tree.insert(11);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(3);

        // you can use any traversal method. here we use post order traversal
        tree.postorder();
    }
}