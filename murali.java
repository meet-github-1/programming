
/*
Murali playing a mobile game, Blast the letters.

In the game he is given a word W and value R.
Murali has to perform the blasting operation as follows:
    - He has to blast the mimeograph M of length R in W, 
      a mimeograph is a string such that each letter in it should be same.
    - After blasting the mimeograph, the rest of the string on 
      its left side and right side, concatenated together.

Murali has to perform the blasting operation repeatedly, 
until no more mimeograph M found.

Your task is to return the final string after all the blast operations have been done.

Input Format:
-------------
Line-1: A string and an integer, W and R.

Output Format:
--------------
Print a string, the final string after all the blast operations have been done.


Sample Input-1:
--------------- 
ababbaaab 3

Sample Output-1:
----------------
aba

Sample Input-2:
--------------- 
caaabbbaacdddd 2

Sample Output-2:
----------------
cabc

*/
import java.util.*;
import java.lang.*;
class murali{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        StringBuilder sb=new StringBuilder(s);
        int n=in.nextInt();
        int count=1;
        int len=s.length();
        char prev=s.charAt(len-1);
        int ind=len-2;
        while(ind>=0){
            if(count==n){
                //System.out.println(ind+1+" "+(ind+n+1));
                sb.delete(ind+1,ind+n+1);
                ind=sb.length()-1;
                prev=sb.charAt(ind);
                //System.out.println(prev);
                count=1;
            }
            else if(sb.charAt(ind)==prev){
                //System.out.println(sb.charAt(ind)+" "+prev);
                count++;
            }
            else{
                prev=sb.charAt(ind);
                //System.out.println(prev);
                count=1;
            }
            ind--;
            //System.out.println(sb.toString()+" "+count);
        }
        if(count==n){
            sb.delete(ind+1,ind+n+1);
        }
        System.out.println(sb.toString());
    }
}