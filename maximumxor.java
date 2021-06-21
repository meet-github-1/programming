/*Xavier working on bitwise operations on integer elements.
He is trying to find the maximum XOR value of two elements.
You will be given a list of integers elements list[],
Your task is to findout the maximum XOR value of two elements 
from the given list.

Input Format:
-------------
Line-1: An integer N, number of elements
Line-2: N space separated integers, Arrays of elements.

Output Format:
--------------
Print an integer, max value of XOR value of two elements.


Sample Input-1:
---------------
3
5 9 14

Sample Output-1:
----------------
12

Explanation:
------------
XOR of 5 and 9


Sample Input-2:
---------------
5
34 23 62 73 35

Sample Output-2:
----------------
119


Sample Input-3:
---------------
6
12 23 31 65 76 43

Sample Output-3:
----------------
106
*/
import java.util.*;
import java.lang.*;
class TrieNode{
    char num;
    TrieNode arr[];
    TrieNode(char n){
        num=n;
        arr=new TrieNode[2];
    }
    public String toString(){
        return num+" ";
    }
}
class maximumxor{
    static TrieNode root;
    static void buildTrie(String s){
        TrieNode temp=root;
        for(int i=0;i<32;i++){
            if(temp.arr[s.charAt(i)-'0']==null){
                temp.arr[s.charAt(i)-'0']=new TrieNode(s.charAt(i));
            }
            temp=temp.arr[s.charAt(i)-'0'];
        }
    }
     static String toBinary(int x) {
        String s=String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
        return s;
     }
     static String setopp(String s){
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<32;i++){
             sb.append(s.charAt(i)=='0'?'1':'0');
         }
         return sb.toString();
     }
     static int xor(String s){
         TrieNode temp=root;
         //System.out.println(s);
         int xor=0;
         for(int i=0;i<32;i++){
             //System.out.println(Arrays.toString(temp.arr));
             if(temp.arr[s.charAt(i)-'0']!=null){
                 xor=xor+(int)Math.pow(2,32-i-1);
                 temp=temp.arr[s.charAt(i)-'0'];
             }
             else{
                 temp=temp.arr[(s.charAt(i)=='0'?'1':'0')-'0'];
             }
         }
         return xor;
     }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }
       root=new TrieNode(' ');
       for(int nm:arr){
           String bin=toBinary(nm);
           buildTrie(bin);
       }
       int max=0;
       for(int nm:arr){
           String bin=toBinary(nm);
           bin=setopp(bin);
           max=Math.max(max,xor(bin));
       }
       System.out.println(max);
    }
}
