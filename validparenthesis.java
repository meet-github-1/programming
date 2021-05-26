import java.util.*;
import java.lang.*;
class validparenthesis{
    static boolean checkbalance(String s,Stack<Character> st1,int srt,int ed){
    	Stack<Character> st=(Stack)st1.clone();
        if(st.isEmpty() && srt==ed){
            return true;
        }
        else if(!st.isEmpty() && srt==ed){
            return false;
        }
        else{
            if(s.charAt(srt)=='('){
                st.push('(');
                return checkbalance(s,st,srt+1,ed);
            }
            else if(s.charAt(srt)==')'){
                if(st.isEmpty() || st.peek()!='('){
                    return false;
                }
                else{
                    st.pop();
                    return checkbalance(s,st,srt+1,ed);
                }
            }
            else{
                st.push('(');
                //System.out.println(st);
                if(checkbalance(s,st,srt+1,ed)){
                    return true;
                }
               // System.out.println(st);
                st.pop();
                if(checkbalance(s,st,srt+1,ed)){
                	return true;
                }
                else{
                	//System.out.println(st);
                   if(st.isEmpty() || st.peek()!='('){
                       return false;
                    }
                    else{
                       st.pop();
                       return checkbalance(s,st,srt+1,ed);
                         
                       }
                }
            }
        }
    }
    public boolean checkValidString(String s) {
        Stack<Character> st=new Stack<Character>();
        int ed=s.length();
        return checkbalance(s,st,0,ed);
    }
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String s=in.next();
       System.out.println(new validparenthesis().checkValidString(s));
    }
}