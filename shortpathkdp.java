import java.util.*;
import java.lang.*;
class shortpathkdp{
	static int MAX=999999;
  static int dp[][];
    static boolean valid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
    }
    static int shortestpath(int arr[][],int r,int c,int i,int j){
       if(!valid(i,j,r,c)){
          return MAX;
       }
       else if(arr[i][j]==-1){
         return MAX;
       }
       else if(dp[i][j]!=-1){
         return dp[i][j];
       }
       else if(i==r-1 && j==c-1){
           return 1;
       }
       else{
          int num=arr[i][j];
          arr[i][j]=-1;
          dp[i][j]=1+Math.min(Math.min(Math.min(shortestpath(arr,r,c,i+num,j),shortestpath(arr,r,c,i-num,j)),shortestpath(arr,r,c,i,j+num)),shortestpath(arr,r,c,i,j-num));
          arr[i][j]=num;
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
	    System.out.println(shortestpath(arr,r,c,0,0));
	}
}