import java.util.*;
import java.lang.*;
class minimize{
    static int dp[][];
    static boolean valid(int x,int y,int n,int m){
        if(x<0 || x>=n || y<0 || y>=m) return false;
        return true;
    }
    static int getminimum(int arr[][],int n,int m,int x,int y){
        if(!valid(x,y,n,m) || arr[x][y]==-2){
            return 9999999;
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        else if(x==n-1 && y==m-1){
            return arr[x][y];
        }
        else{
            int prev=arr[x][y];
            arr[x][y]=-2;
            dp[x][y]=prev+Math.min(getminimum(arr,n,m,x+1,y),getminimum(arr,n,m,x,y+1));
            arr[x][y]=prev;
            return dp[x][y];
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[][]=new int[n][m];
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
                dp[i][j]=-1;
            }
        }
        System.out.println(getminimum(arr,n,m,0,0));
    }
}