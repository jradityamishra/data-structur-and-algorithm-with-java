package tree;
import java.util.*;
public class binarytree2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            // this.left=null;
            // this.right=null;
        }
    }

public static void inorder(Node root){
    if(root==null){
        return;
    }
   inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);
}

//BUILD A BST//
//agar subtree node<root---left ma jayega
//agar subtree node>root----right ma jayega
// left & right subttree are also bst with no duplicate
public static Node insert(Node root,int val){
    if(root==null){
        root=new Node(val); 
        return root;
    }
    if(root.data>val){
        //left side tree ma add kar denga
        root.left=insert(root.left,val);
    }else{
        //right side tree ma add kar denga
        root.right=insert(root.right,val);
    }
    return root;
}

///search key

public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data>key){
        //left subtree choosen
        return search(root.left,key);
    }
   
    else if(root.data==key){
        return true;
    }
    else {
        return search(root.right,key);
    }
}
//delete a node//
public static Node delete(Node root,int val){
    if(root.data>val){
      root.left=  delete(root.left,val);
    }else if(root.data<val){
        root.right=delete(root.right,val);
    }else{
        //root.data==val
        //CASE:-1
        if(root.left==null && root.right==null){
            //agar koi jo node ko delete karna hai uska left and right null hai to 
            //uska parent ko hi null karwa denga to ya automatically delete ho jayega

            return null;
        }
        //CASE:-2
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        //CASE:-3
        Node IS=inorderSuccessor(root.right);
        root.data=IS.data;
        delete(root.right, IS.data);

    }
    return root;
}
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    //Q1.  if x-6 and y-7 print all data prenet betwwn the tree
    public static void printinrange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printinrange(root.left,x,y);
            System.out.println(root.data+" ");
            printinrange(root.right,x,y);
        }
        else if(root.data>=y){
            printinrange(root.left,x,y);
        }
        else{
            printinrange(root.right,x,y);
        }
    }

    public static void main(String[] args){
        // int values[]={5,1,3,4,2,7};
        // Node root=null;
        // for(int i=0; i<values.length; i++){
        //     root=insert(root,values[i]);
        // }
        // inorder(root);
        // System.out.println();

        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);

        }
        inorder(root);
        System.out.println();

        if(search(root,10)){
            System.out.println("found");
            
        }else{
            System.out.println("not found");
        }

        delete(root,10);
        inorder(root);

        //question
        System.out.println("---question-1-----");

        printinrange(root,6,10);
    }
}
