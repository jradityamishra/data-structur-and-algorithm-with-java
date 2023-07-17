package Linklist;
import java.util.*;
public class usingjavaFrameWork {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("s");
        list.addFirst("h");
        list.addFirst("u");
        //Print karwana per array ka form ma milta hai
        list.addLast("m");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        //remove first
        list.removeFirst();
        System.out.println(list);
        ////delete last
        list.removeLast();
        System.out.println(list);



    }
}
