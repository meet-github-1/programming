/*Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example:

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X
Explanation:

Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
*/
class surroundedregion{
    static int dir1[];
    static int dir2[];
    static boolean valid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
    }
    public void solve(char[][] board) {
        dir1=new int[]{1,0,-1,0};
        dir2=new int[]{0,1,0,-1};
        Queue<int[]> q=new LinkedList<int[]>();
        int r=board.length;
        if(r==0){
            return;
        }
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O' && (i==0 || i==r-1 || j==0 || j==c-1)){
                    q.add(new int[]{i,j});
                    board[i][j]='Q';
                }
            }
        }
        while(!q.isEmpty()){
            int arr[]=q.poll();
            //System.out.println(Arrays.toString(arr));
            for(int i=0;i<4;i++){
                if(valid(arr[0]+dir1[i],arr[1]+dir2[i],r,c) && board[arr[0]+dir1[i]][arr[1]+dir2[i]]=='O'){
                    q.add(new int[]{arr[0]+dir1[i],arr[1]+dir2[i]});
                    board[arr[0]+dir1[i]][arr[1]+dir2[i]]='Q';
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='Q'){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
                    
            }
        }
    }
}