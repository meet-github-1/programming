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
class subseqstring{
    static Map<Character,Integer> mp;
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
          int i=0,j=0;
          int cnt=0;
          while(j<len2){
              if(s1.charAt(i)==s2.charAt(j)){
                  j++;
              }
              i++;
              if(i>=len1){
                  i=0;
                  cnt++;
                  }
          }
          if(i!=0){
              cnt++;
          }
          System.out.println(cnt);
        }
    }
}