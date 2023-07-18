package stack;
import java.util.*; 
public class nextGenerator {

    //function right to left method
    public static void solve(int[] arr){
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);//last vale ko push kara diya
        //ussa ab compare karega
        nge[arr.length-1]=-1; //last element ma -1 dal diya

        for(int i=arr.length-2; i>=0; i--){
            //tab tak pop karenga
            //jab tak arr khali na ho jaya and jab tak ussa bada value nhi aa jata hai
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            //agar stack khali ho gayi hai to
            if(st.size()==0){
                nge[i]=-1;
            }else{
                //nhi to top pa issa koi bada aa gaya hai
                nge[i]=st.peek();

            }
            st.push(arr[i]);
        }
        for(int i=0; i<nge.length; i++)
        {
            System.out.println(nge[i]);
        }  

    }
    //function method to right to left to right
    //next greater element on the right
    //khud karna hai .......
    public static void main(String[] args){
        System.out.println("enter the value-");
        Scanner sc=new Scanner(System.in);
       int[] arr=new int[20];
        for(int i=0; i<10; i++)
{
    arr[i]=sc.nextInt();
}     
solve(arr); 

    }
}
 