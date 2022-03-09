package medium;

public class InvertBinaryTree {

    public static void main(String[] args) {

        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.right.right = new BinaryTree(7);
        root.right.left = new BinaryTree(6);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);

        inOrder(root);
        System.out.println();
        invertBinaryTree(root);
        inOrder(root);
    }


    public static void inOrder(BinaryTree tree){
        if (tree == null) return;

        inOrder(tree.left);
        System.out.print(tree.value + " ");
        inOrder(tree.right);
    }
    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        invert(tree);
    }

    public static BinaryTree invert(BinaryTree tree) {
        if (tree == null) return null;

        BinaryTree left = invert(tree.left);
        BinaryTree right = invert(tree.right);

        tree.left = right;
        tree.right = left;

        return tree;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
