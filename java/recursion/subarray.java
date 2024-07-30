package recursion;
import java.util.*;
public class subarray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
       for(List<Integer> list:ans){
        System.out.println(list);
       }
    }
    
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());

        for(int num:arr){
            int n=list.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(list.get(i));
                internal.add(num);
                list.add(internal);
            }
        }

        return list;
    }
}
