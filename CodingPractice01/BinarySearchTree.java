/*
      > Inorder traversal without recursion
      > Post order traversal without recursion
      >PreOrder traversal without  recursion
  
          / 1 \
        2      3
      /  \
    4     5

*/

public class BinarySearchTree {
  Node root;

  public BinarySearchTree() {
    root = null;
  }

  static void inOrderTraversal(Node root) {

    if (root != null) {
      inOrderTraversal(root.left);
      System.out.println(root.data);
      inOrderTraversal(root.right);
    }
  }

  static void PreOrderTraversal(Node root) {
    if (root != null) {
      System.out.println(root.data);
      PreOrderTraversal(root.left);
      PreOrderTraversal(root.right);

    }
  }

  public static void main(String[] args) {
    BinarySearchTree BST = new BinarySearchTree();
    BST.root = new Node(1);
    BST.root.left = new Node(2);
    BST.root.right = new Node(3);
    BST.root.left.left = new Node(4);
    BST.root.left.right = new Node(5);
    inOrderTraversal(BST.root);
    PreOrderTraversal(BST.root);

  }
}

class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    this.left = this.right = null;
  }
}