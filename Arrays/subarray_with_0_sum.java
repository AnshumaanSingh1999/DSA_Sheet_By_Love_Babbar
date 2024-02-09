/*
Problem Solved Successfully 
*/
import java.util.HashSet;
import java.util.Scanner;
class subarray_with_0_sum{
    static boolean findsum(int arr[],int n)
    {
        boolean flag=false;
        int s=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            s=s+arr[i];
            if(arr[i]==0 || h.contains(s)|| s==0){
                flag=true;
            }
            else{
                h.add(s);
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean resp=findsum(a, n);
        String response=(resp==true)?"Yes":"No";
        System.out.println(response);
    }
}