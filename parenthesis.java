/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class parenthesis{
    static int getindex(char ch){
        int flag=0;
        switch(ch){
            case '{':
                flag=0;
                break;
            case '(':
                flag=0;
                break;
            case '[':
                flag=0;
                break;
            case '}':
                flag=1;
                break;
            case ')':
                flag=1;
                break;
            case ']':
                flag=1;
                break;
            default:
              break;
        }
        return flag;
    }
    static boolean matchingpair(char c1,char c2){
         if(c1=='{' && c2=='}') return true;
         else if(c1=='(' && c2==')') return true;
         else if(c1=='[' && c2==']') return true;
         else return false;
    }
    static String balancedornot(String s){
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            int ind=getindex(s.charAt(i));
            if(ind==0){
                st.push(s.charAt(i));
            }
            else{
                if(st.size()==0 || !matchingpair(st.peek(),s.charAt(i))){
                    return "not balanced";
                }
                else{
                    st.pop();
                }
        }
        }
        if(st.size()!=0) return "not balanced";
        return "balanced";
    }
    
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
		    String s=in.next();
		    arr[i]=balancedornot(s);
		    
		}
		for(String i:arr){
		    System.out.println(i);
		}
	}
}