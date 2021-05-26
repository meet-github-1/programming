/*
A forest is represented as a square grid consist of 0's an 1's only.
Few people stuck in the forest, where 1's are indicate people, 
and 0's are indicate as trees. A person cannot move from the tree.

You want to save people, a person can be saved, if he/she connected to other person 
who is at the boundary of forest
If 'a' is connected to 'b' and 'b' is connected to 'c',
then you can consider that 'a' is also connected to 'c'. 
They can connected in 4 directions only (up, right, left and down).

You need to find out the number of persons, whom cannot be saved from 
the given forest grid.


Input Format:
-------------
Line-1 -> An integer N, size of the grid N*N
next N lines -> N space separated integers(0's and 1's)

Output Format:
--------------
Print an integer as your result


Sample Input-1:
---------------
5
0 0 1 1 0
1 0 0 1 0
0 0 1 0 0
0 1 1 0 1
1 0 0 1 0

Sample Output-1:
----------------
3

Explanation:
------------
In the given grid, 1's at (2,2), (3,1), (3,2) positions are not connected 
to the boundary. So, number of people cannot be saved are 3

Sample Input-2:
---------------
5
0 0 1 1 0
1 0 0 1 0
0 0 1 1 0
0 1 1 0 1
1 0 0 1 0

Sample Output-2:
----------------
0

Explanation:
------------
In the given grid, each 1 is either at the boundary or connceted to 1 at boundary.
So, number of people cannot be saved are '0'
*/
import java.util.*;
import java.lang.*;
class open2{
    static boolean valid(int i,int j,int r){
        return(i>=0 && i<r && j>=0 && j<r);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int arr[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int ocnt=0;
        Queue<int[]> q=new LinkedList<int[]>();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(arr[i][j]==1){
                    if(i==0 || j==0 || i==r-1 || j==r-1){
                        q.add(new int[]{i,j});
                        arr[i][j]=0;
                        continue;
                    }
                    ocnt+=1;
                }
            }
        }
        while(!q.isEmpty()){
            int ar[]=q.poll();
            if(valid(ar[0]-1,ar[1],r) && arr[ar[0]-1][ar[1]]==1){
                arr[ar[0]-1][ar[1]]=0;
                ocnt-=1;
                q.add(new int[]{ar[0]-1,ar[1]});
            }
             if(valid(ar[0]+1,ar[1],r) && arr[ar[0]+1][ar[1]]==1){
                ocnt-=1;
                arr[ar[0]+1][ar[1]]=0;
                q.add(new int[]{ar[0]+1,ar[1]});
            }
             if(valid(ar[0],ar[1]-1,r) && arr[ar[0]][ar[1]-1]==1){
                ocnt-=1;
                arr[ar[0]][ar[1]-1]=0;
                q.add(new int[]{ar[0],ar[1]-1});
            }
             if(valid(ar[0],ar[1]+1,r) && arr[ar[0]][ar[1]+1]==1){
                ocnt-=1;
                arr[ar[0]][ar[1]+1]=0;
                q.add(new int[]{ar[0],ar[1]+1});
            }
        }
        System.out.println(ocnt);
    }
}