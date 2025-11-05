class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}
class BST {
    Node1 root;
    Node1 insert(Node1 root, int key) {
        if (root == null) {
            return new Node1(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }
    void inorder(Node1 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        System.out.println("Inorder Traversal of BST:");
        tree.inorder(tree.root);
    }
}