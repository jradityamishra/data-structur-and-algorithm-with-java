package String;
import java.util.*;
public class sq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

        System.out.println(str);
        //change into uppercase

        for(int i=0; i<str.length();i++){
            boolean flag=true;  //--> assume capital
            char ch=str.charAt(i);
            int asci=(int)ch; //kisis value ka integer ma change kar ka dega
            if(ch==' ')continue;

            if(asci>=97){  //--> 97 sa bada hoga to samll than flag is false
                flag=false;
            }
            if(flag==true){
                //capital hai tooo
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }else{
                //small hai too
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    
    }
    
}
