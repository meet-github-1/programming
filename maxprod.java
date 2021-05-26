import java.util.*;
import java.lang.*;
class maxprod{
	static int dp[];
    static int max(int n){
      if(n==0 || n==1){
        return 0;
      }
      else if(dp[n]!=0){
      	  return dp[n];
      }
      else{
          dp[n]=Integer.MIN_VALUE;
          for(int i=1;i<n;i++){
             dp[n]=Math.max(Math.max(i*max(n-i),i*(n-i)),dp[n]);
          }
          return dp[n];
      }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   dp=new int[n+1];
	   System.out.println(max(n));
	}
}