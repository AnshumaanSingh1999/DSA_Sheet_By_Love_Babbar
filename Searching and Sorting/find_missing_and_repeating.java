import java.util.*;
public class find_missing_and_repeating {
    static int[] findTwoElement(int arr[], int n) {
        int x[]=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else if(hm.containsKey(i)==false){
                hm.put(i, 1);
            }
        }
        for(int i=1;i<=n;i++){
            if(hm.containsKey(i)){
                if(hm.get(i)>1){
                    x[0]=i;
                }
            }
            else if(hm.containsKey(i)==false){
                x[1]=i;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Arr[]=new int[N];
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }
        int resp[]=findTwoElement(Arr, N);
        for(int i:resp){
            System.out.println(i);
        }
    }
}