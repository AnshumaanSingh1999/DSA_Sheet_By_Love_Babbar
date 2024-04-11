/*
Problem Solved Successfully
*/
import java.util.*;
public class evaluation_of_postfix_expression
{
    public static int evaluatePostFix(String S)
    {
        int t=0;
        char ch;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            ch=S.charAt(i);
            int x=ch;
            if(x>=48 &&  x<=57){
                st.push(ch-'0');     
            }
            if(ch=='+'){
                int a2=st.pop();
                int a1=st.pop();
                t=a1+a2;
                st.push(t);
            }
            else if(ch=='*'){
                int a2=st.pop();
                int a1=st.pop();
                t=a1*a2;
                st.push(t);
            }
            else if(ch=='-'){
                int a2=st.pop();
                int a1=st.pop();
                t=a1-a2;
                st.push(t);
            }
            else if(ch=='/'){
                int a2=st.pop();
                int a1=st.pop();
                t=a1/a2;
                st.push(t);
            }  
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int resp=evaluatePostFix(S);
        System.out.println(resp);
    }
}