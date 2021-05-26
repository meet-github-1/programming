/*
Kiran is playing with strings and its subsequences.
A subsequence can be formed from a string by deleting some characters 
(may be string itself)

Kiran has given two strings S and T, 
your task to form T by concatenating the subsequences of S  

Return the minimum number of subsequences required to form T.
If the task is impossible, return -1 .

Input Format:
-------------
Line-1 -> Two strings S and T

Output Format:
--------------
Print an integer as result.


Sample Input-1:
---------------
abc abcbc

Sample Output-1:
----------------
2

Explanation: 
------------
T = "abcbc" can be formed by "abc" and "bc",
which are subsequences of S = "abc".


Sample Input-2:
---------------
abc acdbc

Sample Output-2:
----------------
-1

Explanation: 
------------
string T cannot be constructed from the
subsequences of string S due to the character "d" in string T.
*/
import java.util.*;
import java.lang.*;
class subsequniquestring{
    static Map<Character,Integer> mp;
    static int insequence(String s1,String s2,int len){
        int i;
        for(i=1;i<len;i++){
            if(mp.get(s2.charAt(i))<=mp.get(s2.charAt(i-1))){
                break;
            }
        }
        return i;
    }
    static int minsubseq(String s1,String s2){
        if(s2=="" || s1==""){
            return 0;
        }
        else{
            int len=s2.length();
            int ran=insequence(s1,s2,len);
            if(ran==len){
                return 1;
            }
            else{
                //System.out.println(s2+" "+ran);
                return minsubseq(s1,s2.substring(0,ran))+minsubseq(s1,s2.substring(ran,len));
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int len1=s1.length();
        int len2=s2.length();
        mp=new HashMap<Character,Integer>();
        for(int i=0;i<len1;i++){
            mp.put(s1.charAt(i),i);
        }
        boolean flag=true;
        for(int i=0;i<len2;i++){
            if(mp.getOrDefault(s2.charAt(i),-1)==-1){
                flag=false;
            }
        }
        if(!flag){
            System.out.println(-1);
        }
        else{
        System.out.println(minsubseq(s1,s2));
        }
    }
}