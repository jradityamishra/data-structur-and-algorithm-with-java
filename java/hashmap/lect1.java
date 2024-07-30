
package hashmap;
import java.util.*;

public class lect1 {
    public static void main(String[] args) {
        // 1. hashmap
        // HashMap is a class in Java that implements the Map interface. It is a data structure that
        //key-->value(key value pair)

        // roll no |  name
        // ==============
        // 64-------|- ashu
        // 72-------| misha
        // 76------ | kumar

        // country(key),population(value)

        HashMap<String,Integer> data=new HashMap<>();

        // Insertion
        data.put("india",120);
        data.put("US",300);
        data.put("pakistan",900);

        // STORE IN UNORDERED MANNER
        data.put("india",300);
        System.out.println(data);

        // map.put

        // 1.key exist    2.doestnot exist
        // update value   2. new pair inserted

        // search
        if(data.containsKey("india")){
            System.out.println("present");
        }

        // get
        System.out.println(data.get("india")); //exist key
        System.out.println(data.get("indiaNew")); //not exist key

        // Iterate new method
        // for (Map.Entry<String, Integer> entry : data.entrySet()) {

        // for(key:value)
        // int val[]={2,4,5,6};

        // for(int i:val){
        //     System.out.println(i);
        // }

        // Iterate of map
        // Map.Entry<Integer,Integer> e:Map.EntrySet();

        for(Map.Entry<String,Integer> e:data.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // REMOVE
        data.remove("india");



    }
    
}
