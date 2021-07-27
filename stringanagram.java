/*
Given two strings S1 and S2, find if S2 can match S1 or not.

A match that is both one-to-one (an injection) and onto (a surjection), 
i.e. a function which relates each letter in string S1 to a separate and 
distinct non-empty substring in S2, where each non-empty substring in S2 also
has a corresponding letter in S1.

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
mmnn pqrxyzpqrxyz

Sample Output-3:
----------------
false
*/
import java.util.*;
import java.lang.*;
class stringanagram{
    static Map<Character,String> mp;
    static boolean check(String s1,String s2){
        if(s1.length()==0 && s2.length()==0){
            return true;
        }
        else if(s1.length()==0 || s2.length()==0){
            return false;
        }
        else{
            if(mp.get(s1.charAt(0))==null){
                for(int i=0;i<s2.length();i++){
                    if(mp.containsValue(s2.substring(0,i+1))){
                        continue;
                    }
                    mp.put(s1.charAt(0),s2.substring(0,i+1));
                    if(check(s1.substring(1,s1.length()),s2.substring(i+1,s2.length()))){
                        return true;
                    }
                    mp.remove(s1.charAt(0));
                }
                return false;
            }
            else{
                String s=mp.get(s1.charAt(0));
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<s2.length();i++){
                    sb.append(s2.charAt(i));
                    if(s.equals(sb.toString())){
                        return check(s1.substring(1,s1.length()),s2.substring(i+1,s2.length()));
                    }
                }
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        String s1=arr[0];
        String s2=arr[1];
        mp=new HashMap<Character,String>();
        System.out.println(check(s1,s2));
        System.out.println(mp);
    }
}