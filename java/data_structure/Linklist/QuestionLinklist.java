public class QuestionLinklist {
    Node head;
    private int size;
    QuestionLinklist(){
       this.size=0;
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
   public void addfirst(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
}

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
        QuestionLinklist Linklist=new QuestionLinklist();
        Linklist.addfirst(3);
        Linklist.addfirst(3);
        Linklist.addfirst(2);
        Linklist.addfirst(1);
        Linklist.addfirst(1);
        Linklist.printlist();
    }
}
