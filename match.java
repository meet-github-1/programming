/*
Given two strings S1 and S2, find if S2 can match S1 or not.

A match that is both one-to-one (an injection) and onto (a surjection), 
i.e. a function which relates each letter in string S1 to a separate and 
distinct non-empty substring in S2, where each non-empty substring in S2 
also has a corresponding letter in S1.

Return true,if S2 can match S1.
Otherwise false.

Input Format:
-------------
Line-1 -> Two strings S1 and S2

Output Format:
--------------
Print a boolean value as result.


Sample Input-1:
---------------
abab kmitngitkmitngit

Sample Output-1:
----------------
true


Sample Input-2:
---------------
aaaa kmjckmjckmjckmjc

Sample Output-2:
----------------
true

Sample Input-3:
---------------
aabb xyzabcxyzabc

Sample Output-3:
----------------
false
*/
import java.util.*;
import java.lang.*;
class match{
    static Map<Character,String> mp;
    static boolean ifmatch(String s1,String s2,int ind1,int ind2,int len1,int len2){
        //System.out.println(mp);
        if(ind1==len1){
            return true;
        }
        else{
            String s="";
            for(int i=ind2;i<len2;i++){
                if(mp.get(s1.charAt(ind1))==null){
                    mp.put(s1.charAt(ind1),s2.substring(ind2,i+1));
                    boolean res=ifmatch(s1,s2,ind1+1,i+1,len1,len2);
                    if(res==true){
                        return res;
                    }
                    else{
                    mp.remove(s1.charAt(ind1));
                    }
                }
                else{
                    s=s+s2.charAt(i);
                    if(mp.get(s1.charAt(ind1)).compareTo(s)!=0){
                        continue;
                    }
                    else{
                        return ifmatch(s1,s2,ind1+1,i+1,len1,len2);
                    }
                }
            }
            return false;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int len1=s1.length();
        int len2=s2.length();//p
        mp=new HashMap<Character,String>();
        System.out.println(ifmatch(s1,s2,0,0,len1,len2));
    }
}