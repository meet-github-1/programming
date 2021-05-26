/*
Somesh is working on Number Strings.
He got an idea to find the smallest possible number by 
deleting some digits from the number without changing 
the relative order of digits in it.

You will be given a integer String 'num', and an integer n.
Find the smallest number possible after deleting n digits from 'num'.

Note: If the number string 'num' turns to empty, print 0.

Input Format:
-------------
Line-1 : A string num, consist of digits only.
Line-2 : An integer n, number of digits to delete.

Output Format:
--------------
Print the smallest possible number.


Sample Input-1:
---------------
1432219
3

Sample Output-1:
----------------
1219

Explanation: 
------------
Delete the three digits 4, 3, and 2 to form the smallest number 1219.

Sample Input-2:
---------------
10200
1

Sample Output-2:
----------------
200

Explanation:
------------
Delete the leading 1 and the smallest number is 200. 
Note that the output must not contain leading zeroes.
*/
import java.util.*;
import java.lang.*;
class smallsubnumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=in.nextInt();
        int len=s.length();
        Stack<Character> st=new Stack<Character>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)>=st.peek()){
                    st.push(s.charAt(i));
                }
                else{
                    while(!st.isEmpty() && st.peek()>s.charAt(i) && n>0){
                        st.pop();
                        n--;
                    }
                    st.push(s.charAt(i));
                }
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int i;
        for(i=0;i<len-n;i++){
            if(sb.charAt(i)!='0'){
                break;
            }
        }
        //System.out.println(i);
        sb.delete(0,i);
        System.out.println(sb.toString());
    }
}