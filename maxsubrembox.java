/*
Vijay is playing with set of boxes, each box is printed a number on it.
all the boxes placed in a row.

You are given the numbers printed on the boxes in the row.
Your task is to find the maximum sum of the numbers when one box is removed 
from the sub-set of boxes, and the sub-set is selected as a contiguous set of 
boxes from the row. 

Note: The sub-set should not be empty after removal of a box.

Input Format:
-------------
Single line of space separated integers, number on the boxes.

Output Format:
--------------
Print an integer, Maximum sum of sub-set of boxes,
after removal of a box.


Sample Input-1:
---------------
-2 -3 4 -1 -2 1 5 -3

Sample Output-1:
----------------
9

Sample Input-2:
---------------
-2 -3 -4 -1 -2 1 5 -3 8

Sample Output-2:
----------------
14
*/
import java.util.*;
import java.lang.*;
class maxsubrembox{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int num[]=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        int len=num.length;
        //int dp[]=new int[len];
        int st=0;
        int ed=len-1;
        int max=num[0];
        int globalmax=num[0];
        for(int i=1;i<len;i++){
            if(max+num[i]>num[i]){
                max=max+num[i];
            }
            else{
                max=num[i];
                st=i;
            }
            if(max>globalmax){
                ed=i;
                globalmax=max;
            }
        }
        //System.out.println(st+" "+ed);
        if(st==ed){
            System.out.println(num[st]);
        }
        else{
           int min=Integer.MAX_VALUE;
           for(int i=st;i<=ed;i++){
               min=Math.min(min,num[i]);
             }
        System.out.println(globalmax-min);
        }
    }
}