package Day23_BST_Level_Order_Traversal;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            Node top = q.remove();
            System.out.print(top.data + " ");
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) {
                q.add(top.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
