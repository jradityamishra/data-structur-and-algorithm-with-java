public class methods{
   public static void main(String args[]){
    person p1=new person();
    p1.name="ashu";
    p1.age=32;
    //p1.class kar ka action ko access kar sekta hai//
    p1.walk();
    p1.walk(67);
   }
}
class person{
    String name;
    int age;

    //now define methods:-jo kuch action kar paya like walk.run,jump
    //ya compile time polymorphism nhi hai
    void walk(){
        System.out.println(name+"is walking");
    }
    ///argument pass kar ka kiya
    //ya compile time polymorphism hai compile time ma use kar 
    //raha hai
    void walk(int step){
        System.out.println(name+" "+"walked"+" "+step);
    }
}
/////polymorphism :-jab ham same method ko differernt bar call karwa
//sakta hai by using argument or without using argument//
//uper ma hua hai polymorphism ka use;;