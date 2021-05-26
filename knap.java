import java.util.*;
import java.lang.*;
class knap{
	 static int dp[][];
    static int knapsack(int w[],int v[],int cap,int n){
              if(n<0 || cap<=0) return 0;
              if(dp[cap][n]!=-1){
              	return dp[cap][n];
              }
              else{
                 if(w[n]<=cap){
                     dp[cap][n]= Math.max(v[n]+knapsack(w,v,cap-w[n],n-1),knapsack(w,v,cap,n-1));
                 }
                 else{
                    dp[cap][n]=knapsack(w,v,cap,n-1);
                 }
                 return dp[cap][n];
              }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int w[]=new int[n];
	    int v[]=new int[n];
	    for(int i=0;i<n;i++){
	         w[i]=in.nextInt();

	    }
	    for(int i=0;i<n;i++){
	         v[i]=in.nextInt();
	    
	    }
	    int cap=in.nextInt();
	    dp=new int[cap+1][n];
	    for(int i=0;i<=cap;i++){
	    	 for(int j=0;j<n;j++){
	    	 	 dp[i][j]=-1;
	    	 }
	    }
	    System.out.println(knapsack(w,v,cap,n-1));
	}
}