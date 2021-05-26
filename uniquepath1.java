import java.util.*;
import java.lang.*;
class uniquepath1{
   static int dp[][];
   static boolean valid(int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n) return false;
            return true;
   }
   static int noofpossible(int arr[][],int i,int j,int m,int n){
           if(!valid(i,j,m,n)|| arr[i][j]==1){
               return 0;
           }
           if(dp[i][j]!=0){
              return dp[i][j];
           }
           if(i==m-1 && j==n-1){
               return 1;
           }
           else{
                dp[i][j]=noofpossible(arr,i+1,j,m,n)+noofpossible(arr,i,j+1,m,n);
                return dp[i][j];
           }

   }
   static int uniquePaths(int arr[][]){
    int m=arr.length;
    int n=arr[0].length;
	  dp=new int[m][n];
	  return(noofpossible(arr,0,0,m,n));
   }
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
	  System.out.println(uniquePaths(arr));
	}
}