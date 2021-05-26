import java.util.*;
import java.lang.*;
class longpath{
	static int MIN=-999999;
     static int dp[][];
     static boolean valid(int i,int j,int r,int c){
          return(i>=0 && i<r && j>=0 && j<c);
     }
     static int getlongpath(int arr[][],int r,int c,int i,int j){
     	   if(!valid(i,j,r,c)){
     	   	 return 0;
     	   }
           if(dp[i][j]!=-1){
             return dp[i][j];
           }
           else{
              int up=MIN,down=MIN,right=MIN,left=MIN;
              if(valid(i+1,j,r,c) && arr[i][j]+1==arr[i+1][j]){
                  down=1+getlongpath(arr,r,c,i+1,j);
              }
              if(valid(i,j+1,r,c) && arr[i][j]+1==arr[i][j+1]){
                  right=1+getlongpath(arr,r,c,i,j+1);
              }
               if(valid(i-1,j,r,c) && arr[i][j]+1==arr[i-1][j]){
                  up=1+getlongpath(arr,r,c,i-1,j);
              }
               if(valid(i,j-1,r,c) && arr[i][j]+1==arr[i][j-1]){
                  left=1+getlongpath(arr,r,c,i,j-1);
              }
              dp[i][j]=Math.max(Math.max(Math.max(Math.max(up,down),left),right),1);
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
         int max=Integer.MIN_VALUE;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              if(dp[i][j]!=-1){
                 max=Math.max(max,dp[i][j]);
              }
              else{
               max=Math.max(max,getlongpath(arr,r,c,i,j));
               }
            }
         }
         for(int i=0;i<r;i++){
         	for(int j=0;j<c;j++){
         		System.out.print(dp[i][j]+" ");
         	}
         	System.out.println();
         }
         System.out.println(max);
      }	
}