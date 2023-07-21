package String;
import java.util.*;
public class s2 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String str="abcd";

for(int i=0; i<str.length(); i++){
    for(int j=i+1; j<=str.length(); j++){
        System.out.print(str.substring(i, j)+" ");
    }
}
    }
    
}
