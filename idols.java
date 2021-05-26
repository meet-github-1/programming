/*
A merchant has two types of idols, gold and silver.
He has arranged the idols in the form of m*n grid, 
    - the gold idols are represented as 1's 
    - the silver idols are represented as 0's.

Your task is to find the longest consecutive arrangement of gold idols, 
The arranement can be either horizontal, vertical, diagonal or antidiagonal, 
but not the combination of these.


Input Format:
-------------
Line-1: Two space separated integers m and n, grid size.
Next m lines : n space separated integers, arrangement of idols.

Output Format:
--------------
Print an integer, longest arranement of gold idols.


Sample Input:
---------------
4 5
1 0 1 1 1
0 1 0 1 0
1 0 1 0 1
1 1 0 1 1

Sample Output:
----------------
4
*/
import java.util.*;
import java.lang.*;
class idols{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int hdp[][]=new int[r][c];
        int vdp[][]=new int[r][c];
        int addp[][]=new int[r][c];
        int ddp[][]=new int[r][c];
        int mx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    hdp[i][j]=(i==0)?arr[i][j]:hdp[i-1][j]+1;
                    vdp[i][j]=(j==0)?arr[i][j]:vdp[i][j-1]+1;
                    addp[i][j]=(i==0 || j==0)?arr[i][j]:addp[i-1][j-1]+1;
                    ddp[i][j]=(i==0 || j==c-1)?arr[i][j]:ddp[i-1][j+1]+1;
                    mx=Math.max(mx,Math.max(ddp[i][j],Math.max(hdp[i][j],Math.max(vdp[i][j],addp[i][j]))));
                }
            }
        }
        System.out.println(mx);
    }
}