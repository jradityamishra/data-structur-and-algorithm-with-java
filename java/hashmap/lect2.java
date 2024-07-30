package hashmap;
import java.util.*;
public class lect2 {
    public static void majorityElement(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){ //true
            map.put(nums[i],map.get(nums[i])+1);
        }else{  //false
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       }

       for(Map.Entry<Integer,Integer> e:map.entrySet()){
        if((nums.length/3)>e.getValue()){
            System.out.println("print:"+e.getValue());
        }
    }

    }
    // UNION
    public static void union(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        System.out.println(set.size());
    }
    // Intersection
    public static void intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int data=0;
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                set.remove(nums2[i]);
                data++;
            }
        }
        System.out.println(data);
    }
    public static void main(String[] args) {
        // Creating a HashMap
        // 1.put()
        // 2.get()
        // 3.containskey()
        // 4.remove()
        // 5.size()
        // 6.keyset()

    // 1 majaority element

       int nums[]={1,3,2,5,1,3,1,5,1};
    //    majorityElement(nums);

    // 2. union of 2 array

        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        // union(arr1, arr2);

    // 3. Intersection of two array
        int[] ar1={7,3,9};
        int[] ar2={6,3,9,2,9,4};
        intersection(ar1, ar2);
    
    // 4. find Itinerary from ticket
        // from---->TO
        // agar koi city from ma present hai but to ma present nhi hai usko start point choose karenga

        
    }
}
