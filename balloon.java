/*
You are decorating a side wall with balloons.
You have an unlimited set of ballons of three different colors.

The decoration should have N rows of 3 balloons each. 
You have to make sure that no two adjacent balloons have the same colour.
both vertically and horizontally.

Return the number of ways you can decorate the wall,  
the answer must be computed modulo 10^9 + 7

Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer as outpur, number of ways to decorate.


Sample Input-1:
---------------
1

Sample Output-1:
----------------
12

Explanation:
------------
Suppose the colors are, B, G, R. Given N is 1
RBR BRB GRB
RBG BRG GRG
RGR BGR GBR
RGB BGB GBG


Sample Input-2:
---------------
2

Sample Output-2:
----------------
54

*/
import java.util.*;
import java.lang.*;
class balloon{
    static long mod;
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        mod=(long)Math.pow(10,9)+7;
        long dp1[]=new long[n];
        long dp2[]=new long[n];
        long res[]=new long[n];
        dp1[0]=6;
        dp2[0]=6;
        res[0]=(dp1[0]+dp2[0])%mod;
        for(int i=1;i<n;i++){
            dp1[i]=3*dp1[i-1]+2*dp2[i-1];
            dp2[i]=2*dp1[i-1]+2*dp2[i-1];
            res[i]=(dp1[i]+dp2[i])%mod;
        }
        System.out.println(res[n-1]);
    }
}