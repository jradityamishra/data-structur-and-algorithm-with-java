package data_structure.timecomplexity;

public class tc1 {
    public static void main(String[] args){
        double now =System.currentTimeMillis();

        tc1 demo =new tc1();
        System.out.println(demo.findSum(99999));

        System.out.println("Time Token=" + (System.currentTimeMillis()-now)+"millisec");

    }
    public int findSum(int n){
        return n*(n+1)/2;
    }
    // public int findSum(int n){
    //     int sum=0;
    //     for(int i=0; i<=n; i++){
    //         sum=sum+i;

    //     }
    //     return sum;
    // }
    
}
