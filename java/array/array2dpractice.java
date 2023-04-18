package array;
import java.util.Scanner;

public class array2dpractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and com:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] a= new int[r][c];
        int [][] b= new int[r][c];
        System.out.println("enter data:-");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                 a[i][j]=sc.nextInt();
            }
         }
         System.out.println("Printing the input matrix:-");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                 System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
        //  System.out.println("transpose of matrix is:-");
        //  for(int i=0; i<r; i++){
        //     for(int j=0; j<c; j++){
        //         if(i==j){
        //             b[i][j]=a[i][j];
        //         }
        //         else{
        //             b[i][j]=a[j][i];
        //         }
        //     }
        //  }
        // System.out.println("Printing the input matrix:-");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int [][] temp=new int[r][c];
                temp[i][j]= a[c-(j+1)][i];
                b[i][j]=temp[i][j];
            }
          
         }
         System.out.println("Printing the output matrix:-");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                 System.out.print(b[i][j]+" ");
            }
            System.out.println();
         }
         
    }
    
}
