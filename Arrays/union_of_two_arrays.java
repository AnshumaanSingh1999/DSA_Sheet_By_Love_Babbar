/*
Problem Solved Successfully
*/
import java.util.*;
class union_of_two_arrays{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i : a) {
            hs.add(i);
        }
        for(int i:b){
            hs.add(i);
        }
        int l=hs.size();
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int resp=doUnion(a, n, b, m);  
        System.out.println(resp);
    }
}