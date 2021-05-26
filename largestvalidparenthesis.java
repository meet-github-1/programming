/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class largestvalidparenthesis{
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
    static int balancedornot(String s){
        Stack<Integer> st=new Stack<Integer>();
        st.push(-1);
        int crlen=0,mx=0;
        for(int i=0;i<s.length();i++){
            int ind=getindex(s.charAt(i));
            if(ind==0){
                st.push(i);
            }
            else{
                int el=st.pop();
                if(!st.isEmpty()){
                    crlen=i-st.peek();
                    if(crlen>mx){
                        mx=crlen;
                    }

                }
                else{
                    st.push(i);
                }
            }
            

    }
    return mx;
}
  public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		String s=in.next();
		System.out.println(balancedornot(s));
	}
}