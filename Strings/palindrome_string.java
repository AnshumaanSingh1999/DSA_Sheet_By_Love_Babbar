/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class palindrome_string {
    public int isPalindrome(String S) {
        StringBuilder sb=new StringBuilder(S);
        String r=sb.reverse().toString();
        int a=r.equals(S)?1:0;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        palindrome_string pd=new palindrome_string();
        int resp=pd.isPalindrome(S);
        System.out.println(resp);
    }   
}