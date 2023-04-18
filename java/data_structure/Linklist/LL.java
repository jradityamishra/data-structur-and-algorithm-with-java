public class LL {
//CREATE NODE

     Node head;
     private int size;
     LL(){
        this.size=0;
     }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //ADD FIRST
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //ADD LAST
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    //delete first
    public void deletefirst(){
       
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deletelast(){
       
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    //SIZE GET
    public int getSize(){
        return size;
    }
    //print node
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

    public static void main(String args[]){
        LL Linklist=new LL();
        Linklist.addlast("a");
        Linklist.addlast("b");
        Linklist.addlast ("c");
        Linklist.printlist();
        Linklist.deletefirst();
        Linklist.printlist();
        Linklist.deletelast();
        Linklist.printlist();
       System.out.println(Linklist.getSize()); 
    }
}
