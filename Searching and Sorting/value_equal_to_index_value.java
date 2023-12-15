/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class value_equal_to_index_value {
    public ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> items=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                items.add(arr[i]);
            }
        }
        return items;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Arr[]=new int[N];
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }
        value_equal_to_index_value vd=new value_equal_to_index_value();
        ArrayList<Integer> resp=vd.valueEqualToIndex(Arr, N);
        if(resp.isEmpty()){
            System.out.println("Not Found");
        }
        else{
            System.out.println(resp);
        }   
    }
}