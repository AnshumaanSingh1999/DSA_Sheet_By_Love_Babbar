/*
Problem Solved Successfully
*/
import java.util.*;
public class find_the_median {
    public int find_median(int[] v)
    {
        int s=0;
        int m=0;
        int idx=0;
        int ldx=0,rdx=0;
        Arrays.sort(v);
        if(v.length%2==0){
            ldx=(v.length/2)-1;
            rdx=v.length/2;
            s=v[ldx]+v[rdx];
            m=s/2;
        }
        else if(v.length%2!=0){
            idx=(v.length/2);
            m=v[idx];
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        find_the_median fm=new find_the_median();
        int resp=fm.find_median(arr);
        System.out.println(resp);
    }
}