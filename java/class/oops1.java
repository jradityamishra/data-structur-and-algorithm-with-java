public class oops1 {
    public static void main(String args[]){
        //object define
        person p1=new person();
        p1.name= "ashu";
        p1.age=23;
        System.out.println(p1.age+" "+p1.name);

        //object 2
        person p2=new person();
        p2.name="mishra";
        p2.age=43;
        System.out.println(p2.name+""+p2.age);
    }
    
}
//This is the class//
class person{
    String name;
    int age;
}