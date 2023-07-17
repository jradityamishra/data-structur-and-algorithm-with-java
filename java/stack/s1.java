package stack;
import java.util.*;
public class s1 {
    public static void main (String[] args){
        Stack<Integer> st=new Stack<>();

        st.push(10);
        st.push(30);
        st.push(20);
        System.out.println(st);
        st.push(60);
        st.push(90);
        System.out.println(st);
        System.out.println(st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st.peek()+"  "+st.size());
st.pop();
System.out.println(st.peek()+"  "+st.size());
st.pop();
System.out.println(st.peek()+"  "+st.size());
st.pop();
System.out.println(st.peek()+"  "+st.size());
st.pop();
System.out.println(st.peek()+"  "+st.size());



    }
}
