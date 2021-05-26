import java.util.*;
import java.lang.*;
class minpathsum{
	static int dp[][];
 static boolean valid(int x,int y,int m,int n){
		 if(x<0 || x>=m || y<0 || y>=n) return false;
		 return true;
	}
 static int backtrack(int arr[][],int i,int j,int m,int n,int sum){
 	   if(!valid(i,j,m,n)){
            return sum+99999999;
       }
       if(i==m-1 && j==n-1){
          return arr[i][j]+sum;
       }
       else{
           int prev=arr[i][j];
           arr[i][j]=0;
           int min=Math.min(backtrack(arr,i+1,j,m,n,sum+prev),backtrack(arr,i,j+1,m,n,sum+prev));
           arr[i][j]=prev;
           return min;

       }
 }
   static int minPathSum(int arr[][]){
          int rows=arr.length;
          int cols=arr[0].length;
          return(backtrack(arr,0,0,rows,cols,0));
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
	      }
	    }
	    System.out.println(minPathSum(arr));

	}
}