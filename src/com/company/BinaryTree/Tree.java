package com.company.BinaryTree;

import java.util.Optional;

public class Tree {
    Node root;

    public Tree(int key) {
        root=new Node(key);
    }


     public Tree() {
         root = null;
     }

     public void insert(int value)
     {
       add(root,value);
     }
     private Node add(Node root,int value)
     {
         if(root==null)
         {
            return new Node(value);
         }
         if(value<root.getValue())
         {
             root.left =add(root.left,value);
         }else
         {
            root.right=add(root.right,value);
         }
         return root;
     }

     public void inorder()
     {inorderRec(root);}

     public void inorderRec(Node root)
     {

         inorderRec(root.left);
         System.out.println(root.getValue());
         inorderRec(root.right);
     }
     public int maxDepth(Node root)
     {
            if(root==null)
            {
                return 0;
            }
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);

            if(left>right)
            {
                return (left+1);
            }
            else return (right+1);
     }

    public static void main(String[] args) {
        Tree tree=new Tree(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(12);
        tree.insert(1);
        tree.insert(9);
        tree.insert(19);
        tree.insert(10);
        tree.insert(3);
        tree.insert(7);
        System.out.println(tree.maxDepth(tree.root));

    }
}
