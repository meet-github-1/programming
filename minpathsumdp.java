import java.util.*;
import java.lang.*;
class minpathsumdp{
	static int dp[][];
 static boolean valid(int x,int y,int m,int n){
		 if(x<0 || x>=m || y<0 || y>=n) return false;
		 return true;
	}
 static int backtrack(int arr[][],int i,int j,int m,int n){
 	    //System.out.println("start"+" "+i+" "+j);
 	   if(!valid(i,j,m,n)){
 	   	//System.out.println("invalid"+" "+i+" "+j);
            return 9999999;
       }
       if(dp[i][j]!=-1){
       	  return dp[i][j];
       }
       if(i==m-1 && j==n-1){
          return arr[i][j];
       }
       else{
           int prev=arr[i][j];
           arr[i][j]=0;
           int m1=backtrack(arr,i+1,j,m,n);
           int m2=backtrack(arr,i,j+1,m,n);
           dp[i][j]=prev+Math.min(m1,m2);;
           //System.out.println("dynm"+" "+i+" "+j+" "+dp[i][j]);
           arr[i][j]=prev;
           return dp[i][j];

       }
 }
   static int minPathSum(int arr[][]){
          int rows=arr.length;
          int cols=arr[0].length;
          return(backtrack(arr,0,0,rows,cols));
   }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int m=in.nextInt();
	    int n=in.nextInt();
	    int arr[][]=new int[m][n];
	    dp=new int[m][n];
	    for(int i=0;i<m;i++){
	      for(int j=0;j<n;j++){
	         arr[i][j]=in.nextInt();
	         dp[i][j]=-1;
	      }
	    }
	    System.out.println(minPathSum(arr));

	}
}