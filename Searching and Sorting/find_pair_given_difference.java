/*
Problem Solved Successfully
*/
import java.util.*;
public class find_pair_given_difference {
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            hm.put(arr[i],i);
        }
        boolean flag=false;
        int d=0;
        for(int i=0;i<size;i++){
            d=arr[i]+n;
            if(hm.containsKey(d)){
                if(hm.get(d)!=i){
                    flag=true;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int L=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        find_pair_given_difference fd=new find_pair_given_difference();
        boolean resp=fd.findPair(arr, N, L);
        int o=resp?1:-1;
        System.out.println(o);
    }   
}