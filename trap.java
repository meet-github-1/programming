/*
Few people travelling in N*N grid land.
and there are few traps set by local goons. Due to safety restrictions, 
people has to maximize the distance between the traps near to them.

You are given the current status of N*N grid containing values 0 and 1, 
where 0 represents a person and 1 represents trap, 
your task is to find a person's cell such that his/her distance to the 
nearest trap cell is maximized, and return the distance.

The distance used in this problem is the Manhattan distance: 
the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1| .

Input Format:
-------------
Line-1: An integer N, size of the square grid.
Next N lines: N space separated integers, grid[][] either 0 or 1.

Output Format:
--------------
An integer, maximum distance.


Sample Input-1:
---------------
3
1 0 1
0 0 0
1 0 1

Sample Output-1:
----------------
2

Explanation: 
------------
The person at (1, 1) is with distance 2 from all the traps.


Sample Input-2:
---------------
3
1 0 0
0 0 0
1 0 0

Sample Output-2:
----------------
3

Explanation: 
------------
The person at (1, 2) is with distance 3 from all the traps.
*/
import java.util.*;
import java.lang.*;
class trap{
    static int n;
    static boolean valid(int i,int j){
        return(i>=0 && i<n && j>=0 && j<n);
    }
    static boolean ifcheck(int i,int j,int arr[][]){
        if(valid(i-1,j) && arr[i-1][j]==1){
            return true;
        }
        if(valid(i+1,j) && arr[i+1][j]==1){
            return true;
        }
        if(valid(i,j-1) && arr[i][j-1]==1){
            return true;
        }
        if(valid(i,j+1) && arr[i][j+1]==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        Queue<int[]> q=new LinkedList<int[]>();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             arr[i][j]=in.nextInt();   
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0 && ifcheck(i,j,arr)){
                    q.add(new int[]{i,j});
                    arr[i][j]=-1;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int ar[]=q.poll();
            max=Math.max(max,Math.abs(arr[ar[0]][ar[1]]));
            if(valid(ar[0]-1,ar[1]) && arr[ar[0]-1][ar[1]]==0){
                arr[ar[0]-1][ar[1]]=arr[ar[0]][ar[1]]-1;
                q.add(new int[]{ar[0]-1,ar[1]});
            }
            if(valid(ar[0]+1,ar[1]) && arr[ar[0]+1][ar[1]]==0){
                arr[ar[0]+1][ar[1]]=arr[ar[0]][ar[1]]-1;
                q.add(new int[]{ar[0]+1,ar[1]});
            }
            if(valid(ar[0],ar[1]-1) && arr[ar[0]][ar[1]-1]==0){
                arr[ar[0]][ar[1]-1]=arr[ar[0]][ar[1]]-1;
                q.add(new int[]{ar[0],ar[1]-1});
            }
            if(valid(ar[0],ar[1]+1) && arr[ar[0]][ar[1]+1]==0){
                arr[ar[0]][ar[1]+1]=arr[ar[0]][ar[1]]-1;
                q.add(new int[]{ar[0],ar[1]+1});
            }
        }
        System.out.println(max);
    }
}