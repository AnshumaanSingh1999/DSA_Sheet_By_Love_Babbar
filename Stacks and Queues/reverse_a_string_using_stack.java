/*
Problem Solved Successfully
*/
import java.util.*;
public class reverse_a_string_using_stack {
    public String reverse(String S){
        String r="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        while(st.isEmpty()==false){
            r=r+st.pop();
        }        
        return r;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        reverse_a_string_using_stack ras=new reverse_a_string_using_stack();
        String resp=ras.reverse(S);
        System.out.println(resp);
    }
}