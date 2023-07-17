package Linklist;
public class tailquestion {

    // CREATE NODE

    Node head;
    private int size;

    tailquestion() {
        this.size = 0;
    }

    class Node{
                int data;
                Node next;
                Node(int data){
                    this.data=data;
                    this.next=null;
                    size++;
                }
            }
            //ADD FIRST
            public void addfirst(int data){
                Node newnode=new Node(data);
                if(head==null){
                    head=newnode;
                    return;
                }
                newnode.next=head;
                head=newnode;
            }
            //return index
            // public void index(Node posn){
            //     if(head==null){
            //         System.out.println("empty list");
            //         return;
            //     }
            //     Node currnode=head;
            //     while(currnode.next!=null){
            //         currnode=currnode.next;
            //     }
            //     currnode.next=posn;
            // }
            public boolean isPalindrome() {
                Node last=head.next;
                Node secondlast= head;
                while(last.next!=null){
                    last=last.next;
                    secondlast=secondlast.next;
                   
                }
                System.out.println(last.data);
                System.out.println(secondlast.data);
                if(head.data==last.data && head.next.data==secondlast.data){
                    return true;
                }
                else{
                    return false;
                }
            }
            //print list
            public void printlist(){
                if(head==null){
                    System.out.println("list is empty");
                }
                Node currnode=head;
                while(currnode!=null){
                    System.out.print(currnode.data+"-->");
                    currnode=currnode.next;
                }
                System.out.println("null");
            }
            
    public static void main(String[] args){
        tailquestion list=new tailquestion();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(2);
        list.addfirst(1);
        list.printlist();
        System.out.println(list.isPalindrome());
    }
}
