public class Circular {
    static class queueclass{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;


        queueclass(int size){
            arr = new int[size];
            this.size=size;

        }
        public static boolean isempty(){
            return rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return (rear+1) % size==front;
        }
        public static void add(int data){
            if(isfull()){
               System.out.println("full queue");
               return; 
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int delete(){
            if(isempty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            //single element ki condition
            if(rear == front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size; 
            }
            rear--;
            return front;
        }
        //peek

        public static int peek(){
            if(isempty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args){
        queueclass q = new queueclass(5);
        q.add(1);
        q.add(2);
        q.add(3);
System.out.println(q.delete());
q.add(7);
System.out.println(q.delete( ));
        while(!q.isempty()){
            System.out.println(q.peek());
            q.delete();
        }
    }
    
}
