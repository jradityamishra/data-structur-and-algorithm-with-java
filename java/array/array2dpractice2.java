package array;
import java.util.Scanner;
public class array2dpractice2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] a= new int[r][c];
        int [][] b= new int[r][c];

        System.out.println("Enter matrix:-");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j]=sc.nextInt();
            }
         }
    }
    
}
