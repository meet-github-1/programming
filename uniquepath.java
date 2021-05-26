import java.util.*;
import java.lang.*;
class uniquepath{
   static int dp[][];
   static int arr[][];
   static boolean valid(int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n) return false;
            return true;
   }
   static int noofpossible(int i,int j,int m,int n){
           if(!valid(i,j,m,n)){
               return 0;
           }
           if(dp[i][j]!=0){
              return dp[i][j];
           }
           if(i==m-1 && j==n-1){
               return 1;
           }
           else{
                dp[i][j]=noofpossible(i+1,j,m,n)+noofpossible(i,j+1,m,n);
                return dp[i][j];
           }

   }
   static int uniquePaths(int m,int n){
      arr=new int[m][n];
	  dp=new int[m][n];
	  return(noofpossible(0,0,m,n));
   }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int m=in.nextInt();
	  int n=in.nextInt();
	  System.out.println(uniquePaths(m,n));
	}
}