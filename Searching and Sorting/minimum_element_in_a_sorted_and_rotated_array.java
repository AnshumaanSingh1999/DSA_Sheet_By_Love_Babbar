/*
Problem Solved Successfully
*/
import java.util.*;
public class minimum_element_in_a_sorted_and_rotated_array {
    static int findMin(int arr[], int n)
    {
        Arrays.sort(arr);
        int m=arr[0];
        return m;        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=findMin(arr, n);
        System.out.println(r);
    }
}