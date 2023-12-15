/*
Problem Solved Successfully 
*/
import java.util.Scanner;
import java.util.Arrays;
public class kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int x=0;
        Arrays.sort(arr);
        for(int i=l;i<=r;i++){
            if(i==k-1){
                x=arr[i];
            }
        }
        return x;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int resp=kthSmallest(a, l, r, k);
        System.out.println(resp);
    }   
}