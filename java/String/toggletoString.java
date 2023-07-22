package String;
import java.util.*;
public class toggletoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

        System.out.println(str);
        //change into uppercase
        StringBuilder gtr=new StringBuilder(str.reverse());
        if(str==gtr){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrom");
        }





     System.out.println(gtr);
    }
}
