import java.util.*;
import java.lang.*;
class dicethrow{
	static int dp[][];
    static int noofways(int n,int m,int sum){
        if(sum==0 && n==0){
           return 1;
        }
        else if(n==0){
           return 0;
        }
        else if(dp[n][sum]!=-1){
        	 return dp[n][sum];
        }
        else{
            int sm=0;
            for(int i=1;i<=m;i++){
               if(sum>=i){
                  sm=sm+noofways(n-1,m,sum-i);
               }
            }
            dp[n][sum]=sm;
            return dp[n][sum];
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int m=in.nextInt();
	    int n=in.nextInt();
	    int sum=in.nextInt();
	    dp=new int[n+1][sum+1];
	    for(int i=0;i<=n;i++){
	    	for(int j=0;j<=sum;j++){
	    		 dp[i][j]=-1;
	    	}
	    }
	    System.out.println(noofways(n,m,sum));
	}
}