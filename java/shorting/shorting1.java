package shorting;

public class shorting1 {
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ///bubble short:-sabsa bhari object ko last ma rakhta jayenga
        //time complexity = O(n^2)
         int arr[] ={7,8,3,1,2};
         
         for(int i=0; i<arr.length-1; i++){// n-1
            for(int j=0; j<arr.length-i-1; j++){//n-1,n-2,n-3
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
         }
         printarray(arr);
    }
}
