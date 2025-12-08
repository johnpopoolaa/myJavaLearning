package com.acmetech.tree;

// working with binary trees
class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if(root == null)
            root = new Node(data);
        else if(data < root.data)
            root.left = insertRec(root.left, data);
        else if(data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    // printing values from a binary tree
    public void inorder() // in order traversal
    {
        inorderRec(root);
    }

    public void inorderRec(Node root) // recursive in order traversal implementation
    {
        if(root!= null) // only run this if the root is not empty
        {
            // left node -> root node -> right node
            inorderRec(root.left); // traverse the left part of the tree
            System.out.print(root.data + " "); // print out the current node
            inorderRec(root.right); // traverse the right side of the tree
        }
    }

    public void preorder() // pre order traversal
    {
        preorderRec(root);
    }

    public void preorderRec(Node root) // recursive pre order traversal implementation
    {
        if(root != null)
        {
            // root node -> left node -> right node
            System.out.print(root.data +" "); // print the current node first
            preorderRec(root.left); // traverse the next node
            preorderRec(root.right); // traverse the right node
        }
    }

    public void postorder() // post order traversal
    {
        postorderRec(root);
    }

    // left node -> right node -> root node
    public void postorderRec(Node root) // recursive post order traversal implementation
    {
        if(root != null)
        {
            preorderRec(root.left); // traverse the left node first
            preorderRec(root.right); // traverse the right node
            System.out.print(root.data + " "); // print the current node
        }
    }
}