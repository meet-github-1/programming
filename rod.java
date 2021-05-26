import java.util.*;
import java.lang.*;
class rod{
	static int dp[];
    static int maxprice(int arr[],int pri[],int n){
        if(n==0){
          return 0;
        }
        else if(dp[n]!=-1){
        	return dp[n];
        }
        else{
           dp[n]=Integer.MIN_VALUE;
           for(int i=n;i>=1;i--){
              dp[n]=Math.max(dp[n],pri[i]+maxprice(arr,pri,n-arr[i]));
           }
           return dp[n];
        }
    }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int arr[]=new int[n+1];
	  int pri[]=new int[n+1];
	  dp=new int[n+1];
	  for(int i=1;i<=n;i++){
	    arr[i]=i;
	    pri[i]=in.nextInt();
	    dp[i]=-1;
	  }
	  //System.out.println("maxprice");
	  System.out.println(maxprice(arr,pri,n));
	}
}