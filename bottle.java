/*
You are playing a shooting game.
There are N bottles hanging to a rod, i-th bottle numbered bottle[i].

If you shoot i-th bottle, you will get bottle[i-1]*bottle[i]*bottle[i+1] points.
The more points you score, the more rewards you can win.

Your task is to score the maximum points by shooting all the ballons wisely.

Note: After you shoot bottle at i-th index, bottles at i-1 and i+1 positions
become adjacent. if there is no existing 'i-1' or 'i+1' positions for selected bottle.
you can assume that bottle[i-1] = bottle[i+1] = 1.

Input Format:
-------------
N space separated integers bottles[].

Output Format:
--------------
Print an integer, maximum points you can get.


Sample Input:
---------------
3 1 5 8

Sample Output:
----------------
167

Explanation:
------------
Given bottles = [3, 1, 5, 8] 
position 	points
--------------------
1				3*1*5
5				3*5*8
3				1*3*8
8				1*8*1
--------------------
Total = 167


Sample Input:
---------------
2 1 3 5 4

Sample Output:
----------------
102

Explanation:
------------
Given bottles = [2, 1, 3, 5, 4] 

position 	points
--------------------
5				3*5*4
1				2*1*3
3				2*3*4
2				1*2*4
4				1*4*1
--------------------
Total = 102
*/
import java.util.*;
import java.lang.*;
class bottle{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String s[]=in.nextLine().split(" ");
    int len=s.length;
    int arr[]=new int[len+2];
    arr[0]=1;
    for(int i=1;i<=len;i++){
         arr[i]=Integer.parseInt(s[i-1]);
        }
        arr[len+1]=1;
     int dp[][]=new int[len+2][len+2];
     for(int win=1;win<=len;win++){
       for(int lft=1;lft<=len-win+1;lft++){
          int rgt=lft+win-1;
          for(int i=lft;i<=rgt;i++){
                 dp[lft][rgt]=Math.max(dp[lft][rgt],arr[lft-1]*arr[i]*arr[rgt+1]+dp[lft][i-1]+dp[i+1][rgt]);
          }
       }
     }
     System.out.println(dp[1][len]);
	}
}