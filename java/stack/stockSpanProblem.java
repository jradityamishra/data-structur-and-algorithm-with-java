package stack;
import java.util.*;
public class stockSpanProblem {


    //function 
    public static void solve(int[] arr){
        int[] span=new int[arr.length];

        Stack<Integer> st=new Stack<>();

        st.push(0);
        span[0]=-1;

        for(int i=2; i<arr.length; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                //tab tak loop chalega jab tak
                //stack khali na hoo ya
                //current incoming value jayda hai top ka stack sa
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;

            }else{
               span[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println("we get---");
        for(int i=0; i<span.length; i++)
        {
            System.out.println(span[i]);
        } 
    }
    public static void main (String[] args){
        System.out.println("enter the value-");
        Scanner sc=new Scanner(System.in);
       int[] arr=new int[20];
        for(int i=0; i<8; i++)
{
    arr[i]=sc.nextInt();
}     
solve(arr); 
    }
    
}
