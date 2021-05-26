import java.util.*;
import java.lang.*;
class index{
    int x;
    int y;
    index(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class dang{
    static boolean valid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
    }
    static int checkmat(int mat[][],int r,int c){
        int tm=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==-2){
                    return -1;
                }
                else if(mat[i][j]!=-1 && mat[i][j]!=0){
                    tm=Math.max(tm,mat[i][j]);
                }
            }
        }
        return tm;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int mat[][]=new int[r][c];
        int mat1[][]=new int[r][c];
        Queue<index> q=new LinkedList<index>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=in.nextInt();
                if(mat[i][j]==0){
                    mat1[i][j]=-1;
                }
                else if(mat[i][j]==2){
                    mat1[i][j]=0;
                    q.add(new index(i,j));
                }
                else{
                    mat1[i][j]=-2;
                }
            }
        }
        while(!q.isEmpty()){
            index id=q.poll();
            if(valid(id.x-1,id.y,r,c) && mat1[id.x-1][id.y]==-2){
                mat1[id.x-1][id.y]=mat1[id.x][id.y]+1;
                q.add(new index(id.x-1,id.y));
            }
            if(valid(id.x+1,id.y,r,c) && mat1[id.x+1][id.y]==-2){
                mat1[id.x+1][id.y]=mat1[id.x][id.y]+1;
                q.add(new index(id.x+1,id.y));
            }
            if(valid(id.x,id.y-1,r,c) && mat1[id.x][id.y-1]==-2){
                mat1[id.x][id.y-1]=mat1[id.x][id.y]+1;
                q.add(new index(id.x,id.y-1));
            }
            if(valid(id.x,id.y+1,r,c) && mat1[id.x][id.y+1]==-2){
                mat1[id.x][id.y+1]=mat1[id.x][id.y]+1;
                q.add(new index(id.x,id.y+1));
            }
        }
        int ans=checkmat(mat1,r,c);
        System.out.println(ans==Integer.MIN_VALUE?0:ans);
    }
}