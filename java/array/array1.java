package array;
import java.util.Scanner;


public class array1 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    System.out.println("enetr the data:-");
     int r=sc.nextInt();
     int c=sc.nextInt();
     int[][] a=new int[r][c]; //total no of element=r*c
     int[][] b=new int[r][c];
     int[][] sum=new int[r][c];
     int[][] mul=new int[r][c];
     System.out.println("Enter the first array"+ r*c+":-");
     for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            a[i][j]=sc.nextInt();

        }
     }
     System.out.println("Enter the second matrix"+r*c+":_");
     for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            b[i][j]=sc.nextInt();

        }
     }
     for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            sum[i][j]=a[i][j]+b[i][j];

        }
     }
     System.out.println("we get output is:-");
     for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
        for(int k=0; k<c; k++ ){
            mul[i][j]+=(a[i][k]*b[k][j]);
        }
          

        }
        
     }
     for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
         System.out.print(mul[i][j]+" ");

        }
        System.out.println();
     }
    
    }
}
