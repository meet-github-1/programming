import java.util.*;
import java.lang.*;
class path{
      static int dp[][];
      static boolean valid(int i,int j,int r,int c){
           return (i<r && i>=0 && j<c && j>=0);
      }
      static int noofpath(int arr[][],int r,int c,int i,int j){
             if(!valid(i,j,r,c)){
                   return 0;
                  }
              if(arr[i][j]==1){
                  return 0;
              }
              if(i==r-1 && j==c-1){
                  return 1;
              }
              if(dp[i][j]!=-1){
                   return dp[i][j];
              }
              else{
                  dp[i][j]=noofpath(arr,r,c,i+1,j)+noofpath(arr,r,c,i,j+1);
                  return dp[i][j];
              }
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
         System.out.println(noofpath(arr,r,c,0,0));

	  }
}