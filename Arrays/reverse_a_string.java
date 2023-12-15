/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class reverse_a_string {
    public static String reverseWord(String str)
    {
        String r="";
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            r=r+str.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r=reverseWord(s);
        System.out.println(r);
    }    
}