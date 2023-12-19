/*
Problem Solved Successfully
*/
import java.util.*;
public class sort_a_stack_using_recursion {
    public Stack<Integer> sort(Stack<Integer> s)
	{
        s.sort(null);
        return s;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        System.out.println(stack);
        sort_a_stack_using_recursion ss=new sort_a_stack_using_recursion();
        Stack<Integer> resp=ss.sort(stack);
        System.out.println(resp);
        while(resp.isEmpty()!=true){
            System.out.print(resp.pop());
        }
    } 
}