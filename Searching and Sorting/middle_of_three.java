/*
Problem Solved Successfully
*/
import java.util.*;
public class middle_of_three {
    static int middle(int A, int B, int C){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(A);
        al.add(B);
        al.add(C);
        Collections.sort(al);
        int x=al.get(1);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int resp= middle(A, B, C);
        System.out.println(resp);
    } 
}