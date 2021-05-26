/*
Somesh is given a task to you on Strings.
You have given a string S ([a-z]), and an integer array Arr[]
Now your task is to modify 'S' in such way:
replace the 'i+1' characters in the string, with next i-th character 
in alphabetic order(cyclic).

For example, if S="art", Arr[]=[2,3,5] is 3, 
i=0, modify('a') = 'c' , S="crt".
i=1, modify('c') = 'f', modify('r') = 'u', S="fut".
i=2, modify('f') = 'k', modify('u') = 'z', modify('t') = 'y', S="kzy"
Finally modified string is kzy. 

Note: if arr[i]=3 modify('z') ='c'

Return the final modified string after all such modifications to S are applied.

Input Format:
-------------
Line-1 -> A String S,  string length is L
Line-2 -> L space separated integers.

Output Format:
--------------
Print modifed String.


Sample Input-1:
-------------------
adbp
1 2 3 4

Sample Output-1:
--------------------
kmit
*/
import java.util.*;
import java.lang.*;
class open1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int l=s.length();
        String alp="abcdefghijklmnopqrstuvwxyz";
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=in.nextInt();
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<l;i++){
            for(int j=0;j<=i;j++){
                char c=sb.charAt(j);
                int ve=((int)c-97 +arr[i])%26;
                sb.setCharAt(j,alp.charAt(ve));
            }
        }
        System.out.println(sb.toString());
    }
}