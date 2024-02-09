/*
Problem Solved Successfully
*/
import java.util.HashMap;
import java.util.Scanner;
public class triplet_sum_in_array {
    public static boolean find3Numbers(int A[], int n, int X) { 
        int t=0;
        boolean flag=false;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(A[i])){
                m.put(A[i], m.get(A[i])+1);
            }
            else{
                m.put(A[i], 1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i]!=A[j]){
                    t=X-A[i]-A[j];
                    if(t!=A[i] && t!=A[j]){
                        if(m.containsKey(t)){
                            flag=true;
                        }
                    }
                }
            }
        }
        return flag;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean resp=find3Numbers(a, n, k);
        System.out.println(resp);
    }
}