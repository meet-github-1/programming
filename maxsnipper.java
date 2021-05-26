import java.util.*;
import java.lang.*;
class maxsnipper{
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int x[]=new int[n];
	  int y[]=new int[n];
	  for(int i=0;i<n;i++){
	   x[i]=in.nextInt();
	  }
	  for(int i=0;i<n;i++){
	    y[i]=in.nextInt();
	  }
	  int dp[]=new int[n];
	  int max=Integer.MIN_VALUE;
	  for(int i=0;i<n;i++){
	     dp[i]=1;
	    for(int j=i-1;j>=0;j--){
	    	System.out.println(i+" "+j);
	      if(Math.abs(x[i]-x[j])>y[i]+y[j]){
	        dp[i]=Math.max(dp[i],1+dp[j]);
	        }
	    }
	    max=Math.max(max,dp[i]);
	  }
	  System.out.println(Arrays.toString(dp));
	  System.out.println(max);
	}
}