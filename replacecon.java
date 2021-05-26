/*
Ramesh and Suresh are best friends. 
They decided to play a word game.

The game rules are as follows:
    - The game board shows a word W consist of two characters only A and B.
    - You are allowed to replace a pair of neighbour letters AA with BB in W.
    - Finally, The one who failed to replace the letters will lose the game.

You can assume that Ramesh will start playing the game always.

Your task is to determine if Ramesh can guarantee a win.
Print 'true', if Ramesh guarantee a win, otherwise, print 'false'.

Input Format:
-------------
A string W, word.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
AAABAAAA

Sample Output-1:
----------------
true

Explanation:
------------
Given word is AAABAAAA 
Ramesh -> AAABBBAA 
Now whatever the pair Suresh replaced with BB, 
one more replace is possible for Ramesh
So, there is a guarantee for Ramesh to win.

Sample Input-2:
---------------
AAAAAA

Sample Output-2:
----------------
true


Sample Input-3:
---------------
AAABAAA

Sample Output-3:
----------------
false
*/
import java.util.*;
import java.lang.*;
class replacecon{
    static String replace(String s,int a,int b){
        StringBuilder sb=new StringBuilder(s);
        for(int i=a;i<=b;i++){
            sb.setCharAt(i,'B');
        }
        return sb.toString();
    }
    static ArrayList<int[]> find(String s){
        int len=s.length();
        ArrayList<int[]> l1=new ArrayList<int[]>();
        for(int i=0;i<len-1;i++){
            if((s.charAt(i)==s.charAt(i+1)) && (s.charAt(i)=='A')){
                int ar[]=new int[2];
                ar[0]=i;
                ar[1]=i+1;
                l1.add(ar);
            }
        }
        return l1;
    }
    static boolean ispossible(String s){
        List<int[]> l=new ArrayList<int[]>();
        l=find(s);
        if(l.size()==0){
          return false;
        }
        else{
            for(int ar[]:l){
                int a=ar[0];
                int b=ar[1];
                String s1=replace(s,a,b);
                if(!ispossible(s1)){
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        if(s.length()==0){
            System.out.println(false);
        }
        else{
        System.out.println(ispossible(s));
        }
    }
}