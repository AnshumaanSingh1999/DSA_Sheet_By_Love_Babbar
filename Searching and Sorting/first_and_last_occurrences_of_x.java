/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class first_and_last_occurrences_of_x {
    public ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> t=new ArrayList<>();
        for(int i:arr){
            t.add(i);
        }
        int f=t.indexOf(x);
        int l=t.lastIndexOf(x);
        t.clear();
        t.add(f);
        t.add(l);
        return t;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        first_and_last_occurrences_of_x cl=new first_and_last_occurrences_of_x();
        ArrayList<Integer> r=cl.find(arr, n, x);
        System.out.println(r);
    }   
}