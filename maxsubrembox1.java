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
class maxsubrembox1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int num[]=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        int len=num.length;
        //int dp[]=new int[len];
        int fw[]=new int[len];
        int bc[]=new int[len];
        fw[0]=num[0];
        bc[len-1]=num[len-1];
        for(int i=1;i<len;i++){
            fw[i]=Math.max(fw[i-1]+num[i],num[i]);
            bc[len-i-1]=Math.max(bc[len-i]+num[len-i-1],num[len-i-1]);
        }
        //System.out.println(st+" "+ed);
        int globalmax=Integer.MIN_VALUE;
        int prev1=0;
        int prev2=0;
        for(int i=0;i<len;i++){
            prev1=(i==0?0:fw[i-1]);
            prev2=(i==len-1?0:bc[i+1]);
            globalmax=Math.max(globalmax,prev1+prev2);
        }
        System.out.println(globalmax);
    }
}