package tree;
import java.util.*;
public class binarytree1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class binarytree{
        static int index=-1;
        public static Node buildTree(int nodes[]){
           index++;
           if(nodes[index]==-1){
            return null;
           }

           Node newnode=new Node(nodes[index]);
           newnode.left=buildTree(nodes);
           newnode.right=buildTree(nodes);
           return newnode;
        }
    }
    //inorder traverse
    //traversing nodes

    public static void preorder(Node root){
        if(root==null){
           return; 
        }


        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder traversal
    //1.left subtree
    //root
    //right subtree

    public static void inorder(Node root){
        if(root==null){
           return; 
        }

        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    //post order traverse
    //root bad ma aayega
    //1.left subtree
    //2.left subtree
    //3.roots
    public static void postorder(Node root){
        if(root==null){
           return; 
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
       
    }
    //level order travers
    //har level print karna hai
    public static void levelorder(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.println(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            } if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
    }

    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println("-------");
        inorder(root);
        System.out.println("-------");
        postorder(root);
    }
}
