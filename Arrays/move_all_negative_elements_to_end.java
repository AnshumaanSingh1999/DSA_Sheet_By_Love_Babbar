/*
Problem Solved Successfully
*/
import java.util.*;
public class move_all_negative_elements_to_end {
    public void segregateElements(int arr[], int n)
    {
        int k=0;
        int pk=0;
        int nk=0;
        ArrayList<Integer> pose=new ArrayList<>();
        ArrayList<Integer> nege=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pose.add(arr[i]);
            }
            else if(arr[i]<0){
                nege.add(arr[i]);
            }
        }
        while(k<n){
            if(k<pose.size()){
                arr[k]=pose.get(pk);
                pk++;
            }
            else if(k>=pose.size() && k<pose.size()+nege.size()){
                arr[k]=nege.get(nk);
                nk++;
            }
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        move_all_negative_elements_to_end mee=new move_all_negative_elements_to_end();
        mee.segregateElements(arr, N);
    }   
}