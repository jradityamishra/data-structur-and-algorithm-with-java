package pracrice;

public class p1 {
    public static int maxProduct(int[] nums) {
        long val = Integer.MIN_VALUE;
         if (nums.length == 1) {
             return nums[0];
         }
         for (int i = 0; i < nums.length; i++) {
             long pro = 1;  // Initialize product for each starting point i
             for (int j = i; j < nums.length; j++) {
                 pro = pro * nums[j];
                 
               
                    val = Math.max(val, pro);
                    System.out.println("value:"+nums[j]+" :"+val);
                
             }
         }
         return (int)val;
     }
    public static void main(String[] args) {
        int[] arr={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int data=maxProduct(arr);
       System.out.println(data);
    }
    
}
