import java.util.*;
import java.lang.*;
class minlossdp{
    static final int max=99999;
    static int dp[][];
	static boolean isvalid(int i,int j,int r,int c){
		  return(i<r && i>=0 && j<c && j>=0);
	}
	 static int getminloss(int arr[][],int i,int j,int r,int c){
    	   if(i==r-1 && j==c-1){
    	   	      return arr[i][j];
    	   }
           if(!isvalid(i,j,r,c)){
              return max;
           }
           if(dp[i][j]!=-1){
	           return dp[i][j];
	       }
           else{

              dp[i][j]=Math.min((arr[i][j]+getminloss(arr,i+1,j,r,c)),(arr[i][j]+getminloss(arr,i,j+1,r,c)));
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
	   System.out.println(getminloss(arr,0,0,r,c));
	 }
}