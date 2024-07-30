package recursion;

import java.util.Arrays;

public class mergesort {
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] max=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                max[k]=first[i];
                i++;
            }else{
                max[k]=second[j];
                j++;
            }
            k++;
        }
       while(i<first.length){
        max[k]=first[i];
        i++;
        k++;
       }

       while(j<second.length){
        max[k]=second[i];
        j++;
        k++;
       }
    return max;

    }
    public static void main(String[] args) {
        int[] arr={2,5,9,4,6};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
