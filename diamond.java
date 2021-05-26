import java.util.*;
import java.lang.*;
class diamond{
    static int dp[][];
    static boolean valid(int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c) return false;
        return true;
    }
    static int maxdiamond(int arr[][],int r,int c,int i,int j){
        if(!valid(i,j,r,c) || arr[i][j]==-2){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            int prev=arr[i][j];
            arr[i][j]=-2;
            dp[i][j]=Math.max(Math.max(prev+maxdiamond(arr,r,c,i,j+1),prev+maxdiamond(arr,r,c,i-1,j+1)),prev+maxdiamond(arr,r,c,i+1,j+1));
            arr[i][j]=prev;
            return dp[i][j];
            
        }
    }
    static int getmaxdiam(int arr[][],int r,int c){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            mx=Math.max(mx,maxdiamond(arr,r,c,i,0));
        }
        return mx;
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[r][c];
        dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
                dp[i][j]=-1;
            }
        }
        System.out.println(getmaxdiam(arr,r,c));
    }
}