package String;
import java.util.*;
public class s1 {
    public static void main(String[] args){
        //char[] arr=new char[10];
        //limitation hai size kaa
       // Scanner sc=new Scanner(System.in);
        //String s=sc.next(); //ya bas ek word lata hai
       // String sa=sc.nextLine(); //ya pura line laga
      
        String str="college";
        //int length=str.length(); //ans=7
       // System.out.println(str.charAt(0)); //for getting index character
        //charAt():-
        // String str="college ashu";

           //indexof() ;-
        //----------------
        //----------------
        //ya dega kitna index pa wo value hai

       // System.out.println(str.indexOf("e"));
        //first pa jo payega wahi index dega second wala ko nhi consider karta hai

        
           //compareTo() ;-
        //----------------
        //----------------
        //let assume to string 1.str, 2.gtr
        //str==gtr -->0 ans
        //str>gtr  >0
        //str<gtr <0

        //str.compare(gtr);
       // String gtr="zshu";
        //System.out.println(str.compareTo(gtr));

        //contains() ;-
        //----------------
        //----------------

        //if we want to check any value present in the string than we use this
        //System.out.println(str.contains("ll"));
        // System.out.println(str.endsWith("all"));
        // System.out.println(str.startsWith("all"));
        //System.out.println(str.toLowerCase());
        //System.out.println(str.toUpperCase());
        //String gtr="mishra";
        //System.out.println(str.concat(gtr));


            //some important things
    //==========================================

    // String s="abc";
    // s +="xyz";
    // s +="r";
    // s +=10;
    // System.out.println(s);

     //substring(i,j) and substring(i)
    //==========================================

        System.out.println(str.substring(0, 2));
    }   //(0,2) 0 included and 2 excludeded
    
}
