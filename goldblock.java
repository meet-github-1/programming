/*A magic box with p rows and r columns is initially filled with silver.
If we invoke a method 'addMagicOperation' which turns the silver at index (r, c)
into gold. 

Given N set of indices to work up on, find the number of gold-blocks which 
are formed after each addMagicOperation. 

A gold-block is a block of gold cells connected horizontally and vertically and 
surrounded by silver. Consider all four edges of the magic box are surrounded by
silver.

Input Format:
--------------
Line-1: Three space separated integers p, r , and n (number of add Magic Operations)
Next N lines: Two space separated integers, cell to perform addMagicOperation 

Output Format:
--------------
Print a list of numbers, number of gold-blocks formed after each addMagicOperation


Sample Input-1:
-----------------
3 3 5
0 0
0 1
1 2
2 1
1 1

Sample Output-1:
-----------------
[1, 1, 2, 3, 1]

Explanation:
-----------
Initially, the magic box is filled with silver. 
(Assume 0 represents silver and 1 represents gold).

0 0 0
0 0 0
0 0 0

Operation #1: addMagicOperation(0, 0) turns the silver at cell[0][0] into gold.

1 0 0
0 0 0   Number of Gold-blocks = 1
0 0 0

Operation #2: addMagicOperation(0, 1) turns the silver at cell[0][1] into gold.

1 1 0
0 0 0   Number of Gold-blocks = 1
0 0 0

Operation #3: addMagicOperation(1, 2) turns the silver at cell[1][2] into gold.

1 1 0
0 0 1   Number of Gold-blocks = 2
0 0 0

Operation #4: addMagicOperation(2, 1) turns the silver at cell[2][1] into gold.

1 1 0
0 0 1   Number of Gold-blocks = 3
0 1 0

Operation #5: addMagicOperation(1, 1) turns the silver at cell[1][1] into gold.

1 1 0
0 1 1   Number of Gold-blocks = 1
0 1 0
*/
import java.util.*;
import java.lang.*;
class goldblock{
    static int dir1[];
    static int dir2[];
    static boolean vis[][];
    static boolean isvalid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
    }
    static void dfs(int arr[][],int i,int j,int r,int c){
        if(!isvalid(i,j,r,c)){
            return;
        }
        else if(vis[i][j]){
            return;
        }
        else{
            vis[i][j]=true;
            for(int i1=0;i1<4;i1++){
                if(isvalid(i+dir1[i1],j+dir2[i1],r,c) && arr[i+dir1[i1]][j+dir2[i1]]==1 && !vis[i+dir1[i1]][j+dir2[i1]]){
                   dfs(arr,i+dir1[i1],j+dir2[i1],r,c); 
                }
            }
            return ;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int tr=in.nextInt();
        int arr[][]=new int[r][c];
        dir1=new int[]{1,0,-1,0};
        dir2=new int[]{0,1,0,-1};
        List<Integer> l=new ArrayList<Integer>();
        int count=0;
        for(int i1=0;i1<tr;i1++){
            int r1=in.nextInt();
            int c1=in.nextInt();
            arr[r1][c1]=1;
            count=0;
            vis=new boolean[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(!vis[i][j] && arr[i][j]==1){
                        dfs(arr,i,j,r,c);
                        count++;
                    }
                }
            }
            l.add(count);
            
        }
        System.out.println(l);
        
    }
}