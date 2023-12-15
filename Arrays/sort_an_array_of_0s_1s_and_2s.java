/*
Problem Solved Successfully
*/
import java.util.Scanner;
class sort_an_array_of_0s_1s_and_2s{
    public static void sort012(int a[], int n)
    {
        int k=0;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c0++;
            }
            else if(a[i]==1){
                c1++;
            }
            else if(a[i]==2){
                c2++;
            }
        }
        while(k<n){
            if(k<c0){
                a[k]=0;
            }
            else if(k>=c0 && k<c1+c0){
                a[k]=1;
            }
            else if(k>=c1+c0 && k<c0+c1+c2){
                a[k]=2;
            }
            k++;
        }
        for(int i:a){
            System.out.println(i);
        }   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort012(a, n);
    }
}