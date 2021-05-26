import java.util.*;
import java.lang.*;
class maxsquare{
    static int dp[][];
    static int square(int arr[][],int r,int c){
           for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                  if(arr[i][j]==1){
                      dp[i][j]=(i==0 || j==0)?arr[i][j]:(Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1);
                      //System.out.println(i+" "+j);
                  }
              }
           }
           int max=Integer.MIN_VALUE;
           for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                if(dp[i][j]>max){
                  max=dp[i][j];
                }
             }
           }
           for(int i=0;i<r;i++){
           	 for(int j=0;j<c;j++){
           	 	System.out.print(dp[i][j]+" ");
           	 }
           	 System.out.println();
           }
           return (max*max);
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
	     System.out.println(square(arr,r,c));
	 }
}