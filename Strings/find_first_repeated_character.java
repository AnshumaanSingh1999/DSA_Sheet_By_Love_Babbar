/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class find_first_repeated_character {
    static String firstRepChar(String s) 
    { 
        String r="";
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(al.contains(s.charAt(i))){
                r=r+s.charAt(i);
                break;
            }
            else{
                al.add(s.charAt(i));
            }
        }
        if(r.isEmpty()){
            r="-1";
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String resp=firstRepChar(S);
        System.out.println(resp);
    }
}