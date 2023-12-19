/*
Problem Solved Successfully 
*/
package Matrix;
import java.util.Arrays;
import java.util.Scanner;
public class median_in_row_wise_sorted_matrix {
    static int median(int matrix[][], int R, int C) {
        int a[]=new int[R*C];
        int k=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a[k]=matrix[i][j];
                k++;
            }
        }
        Arrays.sort(a);
        int mi=a.length/2;
        int c=a[mi];
        return c;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int M[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                M[i][j]=sc.nextInt();
            }
        }
        int resp=median(M, R, C);
    }
}