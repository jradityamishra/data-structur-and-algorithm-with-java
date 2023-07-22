package String;
import java.util.*;
public class s1 {
    public static void main(String[] args){
        //char[] arr=new char[10];
        //limitation hai size kaa
       // Scanner sc=new Scanner(System.in);
        //String s=sc.next(); //ya bas ek word lata hai
       // String sa=sc.nextLine(); //ya pura line laga
      
       // String str="college";
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

    //  substring(i,j) and substring(i)
    // ==========================================

       // System.out.println(str.substring(0, 2));
    
       //(0,2) 0 included and 2 excludeded


     //  Interning and new
    // ==========================================

    // String gtr="hello";
    // String ptr="hello";
    // String ktr="hello";

    //hello store in a single palce and all show the same address
    //internig ham use karta hai space bachana ka liya
    //isko sahi karna ka liya hmm new use karta hai

    
 //  Immuttable & equal
    // ==========================================

//string ma agar kuch store kar diya hai to usko change nhi kar sakta
        // String s1="ashu";
        // String s2="ashu";
        // String s3=new String("ashu");
        // System.out.println();

        //s1==s2  give true
        //s1==s3 false becz both store at differ location
        //System.out.println(s1.equals(s3));
          
    
   
 //     StringBuilder
    // ==========================================
        //same as Arraylist

       // StringBuilder ss=new StringBuilder("hello");
      //  ss +="ashu"; //ya nhi kar sakta stringbuilder
   
   //     setCharAt()
    // ==========================================
       StringBuilder str=new StringBuilder("hello");
   
        str.setCharAt(0,'s');
        System.out.println(str);
        str.insert(0, 'p');
        System.out.println(str);
        //append use karta hai aaga lagana ka liya
        System.out.println(str.append(10));
        //deleteChartAt
        System.out.println(str.deleteCharAt(0));


        //reverse and delete
//===================================
        System.out.println(str.reverse());
        System.out.println(str.delete(0,3));

}
}
