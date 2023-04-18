public class doublell {
    Node head;
    Node tail;
    private int size;
    doublell(){
        this.head=null;
        this.tail=null;
        this.size=0;
       }
   class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
    }
   }
   
   public boolean isempty(){
     return size==0;
   }
   public int length(){
    return size;
   }
   public void addfirst(int data){
    Node newnode=new Node(data);
    if(isempty()){
        tail=newnode;
    }else{
        head.prev=newnode;
    }
    newnode.next=head;
    head=newnode;
    size++;
   }

   public void addlast(int data){
    Node newnode=new Node(data);
    if(isempty()){
        head=newnode;
    }else{
    tail.next=newnode;
    newnode.prev=tail;
    }
    tail=newnode;
    size++;

}

public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
}

public void deletefirst(){
    if(isempty()){
        System.out.println("empty");
    }
    Node temp=head;
    if(head==tail){
        tail=null;
    }else{
        head.next.prev=null;
    }
    head=head.next;
    temp.next=null;
    size--;

}

public void deletelast(){
    if(isempty()){
        System.out.println("empty");
    }
    Node temp=tail;
    if(head==tail){
        head=null;
    }else{
        tail.prev.next=null;
    }
    tail=tail.prev;
    temp.prev=null;
    size--;
}

public void insertanypos(int data,int pos){
    Node newnode=new Node(data);
    Node temp=head;
    Node curr=temp.next;
    if(pos==1){
       addfirst(data); 
    }else{

    for(int i=0; i<pos-1; i++){
        temp=curr;
        curr=temp.next;
    }
}
    newnode.prev=temp;
    newnode.next=curr;
    temp.next=newnode;
    curr.prev=newnode;
}
    public static void main(String[] args){
        doublell ll=new doublell();
        ll.addfirst(3);
        ll.addfirst(6);
        ll.addlast(3);
        ll.insertanypos(1, 7);
        
        ll.print();
    }
}
