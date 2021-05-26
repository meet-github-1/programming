/*
Bablu is given a string S and an integer K.
Bablu has to findout the length of the longest substring of S, 
such that, the occurence count of each character in substring should be at least K.

NOTE: S conatins only lowercase letters

Input Format:
-------------
Line-1: A string S.
Line-2: An integer K.

Output Format:
--------------
An integer, length of longest substring.


Sample input-1:
---------------
adbccbac
2

Sample output-1:
----------------
4

Explanation:
------------
The longest substring is "bccb"


Sample input-2:
---------------
ababbc
2

Sample output-2:
----------------
5

Explanation:
------------
The longest substring is "ababb"
*/
import java.util.*;
import java.lang.*;
class longestksubstring{
    static int findlongest(String s,int k){
        int len=s.length();
        if(len==0 || len<k) return 0;
        if(k<=1) return len;
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        for(int i=0;i<len;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int l=0;
        while(l<len && mp.get(s.charAt(l))>=k){
            l++;
        }
        if(l>=len){
            return l;
        }
        int l1=findlongest(s.substring(0,l),k);
        while(l<len && mp.get(s.charAt(l))<k){
            l++;
        }
        int l2=findlongest(s.substring(l,len),k);
        //p
        return Math.max(l1,l2);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int k=in.nextInt();
        System.out.println(findlongest(s,k));
    }
}