/*
Aravind went to a forest, he stuck inside the forest and He is blind.
The forest is given as a square grid. The forest grid is filled with trees and empty cells.
He can move upwards, downwadrs, left and right, but he cannot stop until he touches the tree.
Once he touches a tree, ha can choose the next direction to move.
Intially Aravind is at poistion A, and he is trying to reach a safe-point at position S.

You will be given the forest grid filled with 1's and 0's, 1 means tree and 0 means empty cell.
And initial position of Aravind, safe-point S.

Your task is to find the minimum distance travelled by Aravind to reach the safe-point
If he cannot stop at the safe-point, return -1.

You may assume that the borders of the forest are all trees.

Input Format:
-------------
Line-1: An integer N, size of the grid.
Next N lines: N space separated integers
Next line:  two space separated integers, initial position of Aravind
Next line:  two space separated integers, position of safe-point.

Output Format:
--------------
Print an integer, minimum distance travelled by Aravind to reah safe-point.


Sample Input-1:
---------------
5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
2 4
4 0

Sample Output-1:
----------------
10

Explanation:
------------
For Picture look at hint.
The minimum path is : up -> left -> down -> left.

Sample Input-2:
---------------
5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
0 3
3 3

Sample Output-2:
----------------
-1

Explanation: 
------------
Aravind cannot stop at safe-point.
*/
import java.util.*;
import java.lang.*;
class treeforest{
    static int dp[][];
    static int dir1[];
    static int dir2[];
    static boolean vis[][];
    static int MAX=999999;
    static boolean valid(int arr[][],int x,int y,int n){
        return (x>=0 && x<n && y>=0 && y<n && arr[x][y]!=1);
    }
    static int findmin(int arr[][],int px,int py,int sx,int sy,int n){
        if(!valid(arr,px,py,n)){
            //System.out.println(px+" "+py);
            return MAX;
        }
        if(px==sx && py==sy){
            return 0;
        }
        else if(dp[px][py]!=0){
            return dp[px][py];
        }
        else if(vis[px][py]){
            return MAX;
        }
        else{
            vis[px][py]=true;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<4;i++){
                int x=dir1[i];
                int y=dir2[i];
                int dist=0;
                //System.out.println(x+" "+y);
                while(valid(arr,px+x,py+y,n)){
                    //System.out.println("xy"+" "+x+" "+y);
                    x=x+dir1[i];
                    y=y+dir2[i];
                    dist++;
                }
                //System.out.println(ax+" "+ay+" "+px+" "+py);
                x=x-dir1[i];
                y=y-dir2[i];
                min=Math.min(min,dist+findmin(arr,px+x,py+y,sx,sy,n));
            }
            dp[px][py]=min;
            return dp[px][py];
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][n];
        vis=new boolean[n][n];
        //Queue<int[]> q=new LinkedList<int[]>
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
                /*if(arr[i][j]==1){
                    q.add(new int[]{i,j});
                }*/
            }
        }
        dp=new int[n][n];
        dir1=new int[]{1,-1,0,0};
        dir2=new int[]{0,0,1,-1};
        int px=in.nextInt();
        int py=in.nextInt();
        int sx=in.nextInt();
        int sy=in.nextInt();
        int ans=findmin(arr,px,py,sx,sy,n);
        System.out.println(ans==MAX?-1:ans);
    }
}