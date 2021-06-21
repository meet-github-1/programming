/*
A transitive law is "If a == b and b == c, then a == c"
Which also says "If a == b and b != c, then a != c"

You will be given a list of strings relations[], i.e, like p==q or p!=q.
Your task is to find out whether all the relations follow the transitive law or not.
If all of them followed return true, otherwise return false.

Input Format:
-------------
Space separated strnigs, list of relations

Output Format:
--------------
Print a boolean value, whether transitive law is obeyed or not.


Sample Input-1:
---------------
a==b c==d c!=e e==f

Sample Output-1:
----------------
true


Sample Input-2:
---------------
a==b b!=c c==a

Sample Output-2:
----------------
false


Sample Input-3:
---------------
a==b b==c c!=d d!=e f==g g!=d

Sample Output-3:
----------------
true
*/
import java.util.*;
import java.lang.*;
class transitive{
    static void union(char c1,char c2,char eq[]){
        char p1=find(c1,eq);
        char p2=find(c2,eq);
        if(p1!=p2){
            eq[p2-'a']=p1;
        }
    }
    static char find(char c,char eq[]){
        //System.out.println(c);
        if(eq[c-'a']!=c){
            return eq[c-'a']=find(eq[c-'a'],eq);
        }
        return c;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char eq[]=new char[26];
        for(int i=0;i<26;i++){
            eq[i]=(char)(97+i);
        }
        //System.out.println(Arrays.toString(eq));
        String ar[]=in.nextLine().split(" ");
        List<String> l=new ArrayList<String>();
        for(String s:ar){
            if(s.substring(1,s.length()-1).equals("==")){
                //System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
                union(s.charAt(0),s.charAt(s.length()-1),eq);
            }
            else{
                l.add(s);
            }
        }
        boolean flag=true;
        for(String s:l){
            char p1=find(s.charAt(0),eq);
            char p2=find(s.charAt(s.length()-1),eq);
            if(p1==p2){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
