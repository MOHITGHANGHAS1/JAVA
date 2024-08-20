package Data_Structure;


class Binary_Search_tree {
    public class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public Binary_Search_tree() {
        root = null;
    }

    public void insert(int data) {
        Node n1 = new Node(data);
        if (root == null) {
            root = n1;
            return;
        } else {
            Node current = root, parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = n1;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = n1;
                        return;
                    }
                }
            }
        }
    }

    public Node minNode(Node root) {
        if (root.left != null) {
            return minNode(root.left);
        } else {
            return root;
        }
    }

    public Node delete(Node node, int value) {
        if (node == null) {
            return null;
        } else {
            if (value < node.data) {
                node.left = delete(node.left, value);
            } else if (value > node.data) {
                node.right = delete(node.right, value);
            } else {
                if (node.left == null && node.right == null) {
                    return null;
                } else if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                } else {
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = delete(node.right, temp.data);
                }
            }
        }
        return node;
    }

    public void inorder(Node node) {
        if (node != null) {
            if (node.left != null) {
                inorder(node.left);
            }
            System.out.print(node.data + " ");
            if (node.right != null) {
                inorder(node.right);
            }
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            if (node.left != null) {
                preorder(node.left);
            }
            if (node.right != null) {
                preorder(node.right);
            }
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            if (node.left != null) {
                postorder(node.left);
            }
            if (node.right != null) {
                postorder(node.right);
            }
            System.out.print(node.data + " ");
        }
    }
}

public class Binary_tree {
    public static void main(String[] args) {
        Binary_Search_tree a = new Binary_Search_tree();
        a.insert(10);
        a.insert(20);
        a.insert(50);
        a.insert(60);
        a.insert(70);
        a.insert(30);
        a.insert(40);
        System.out.println("Inorder : ");
        a.inorder(a.root);

        a.delete(a.root, 50);
        System.out.println("\nInorder after deleting 50: ");
        a.inorder(a.root);

        System.out.println("\nPreorder : ");
        a.preorder(a.root);
        System.out.println("\nPostorder : ");
        a.postorder(a.root);
    }
}
 