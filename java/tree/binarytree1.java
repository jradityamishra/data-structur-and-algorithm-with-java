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
    //preorder traverse
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
        if(root==null){
            return;
        }
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
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            } if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
    }
    //cout of nodes start//
    //total no of node add kar lo left node +right node
    //x+y+1 left=x right=y and self=1

    public static int countnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=countnodes(root.left);
        int rightnodes=countnodes(root.right);

        return leftnodes+rightnodes+1;
    }

    //coutn of node end//
    //sum of nodes start//
    // left.data+right.data+self.data
     
    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);

        return leftsum+rightsum+root.data;
    }
    //sum of nodes end//
    //height of tree start//
    //no of nodes ka level find kar ka show kr denga

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int myheight=Math.max(leftheight,rightheight)+1;
        return myheight;

    }

    //height of tree end//
    //diameter of tree start//
    //outer boundary node count kar lenga--[1]
     public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        
        int dia1=diameter(root.left);
        int dia2=diameter(root.right); 
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam3,Math.max(dia1,dia2));

     }
     //approch -2
     static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
        
     }
     public static Treeinfo diameter2(Node root){
        if(root==null){
            return new Treeinfo(0,0);
        }
        Treeinfo left=diameter2(root.left);
        Treeinfo right=diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        Treeinfo myinfo=new Treeinfo(myheight,mydiam);
        return myinfo;

     }
    //diameter of tree end//

   public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println("----inorder---");
        inorder(root);
        System.out.println("---post order----");
        postorder(root);
        System.out.println("---level order----");
        levelorder(root);
        System.out.println("---count of nodes----");
        System.out.println(countnodes(root));
        System.out.println("---sum of nodes----");
        System.out.println(sumofnodes(root));
        System.out.println("---height of nodes----");
        System.out.println(height(root));
        System.out.println("---diameter of nodes----");
        System.out.println(diameter(root));
        System.out.println("---diameter approch 2 of nodes----");
        System.out.println(diameter2(root).diam);
    }
}
