public class ll {
    private int size;
    ll(){
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add-first

    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }

    //add last
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next !=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    // print
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return; 
        }
        Node currnode=head;
        while(currnode !=null){
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }

    //delete

    public void deletefirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last

    public void deletelast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        size--; 
        if(head.next==null){
            head=null;
            return;
        }
        Node currnode=head;
        Node secondlast=head.next;//head.next=null ->lastnode=null 
        while(secondlast.next!=null){
            currnode=currnode.next;
            secondlast=secondlast.next;
            
        }
        currnode.next=null;

    }


    public static void main(String[] args){
        ll list=new ll();
        list.addfirst("a");
        list.addfirst("b");
        list.printlist();
        list.deletelast();
        list.printlist();
        System.out.println(list.size);


    }
}
