import java.util.*;
import java.lang.*;
class maxsquareled{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int dp[][]=new int[m][n];
        int mx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                dp[i][j]=(i==0||j==0)?arr[i][j]:Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                //System.out.print(dp[i][j]+" ");
                mx=Math.max(mx,dp[i][j]);
                }
            }
            //System.out.println();
        }
        System.out.println(mx*mx);
    }
}