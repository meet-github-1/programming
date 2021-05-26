import java.util.*;
import java.lang.*;
class partition{
	 static int dp[][];
     static boolean ispartition(int arr[],int n,int sum){
        if(sum==0){
           return true;
        }    
        else if(n<0 || sum<0){
            return false;
        }
         else if(dp[n][sum]!=-1){
        	return dp[n][sum]==0?false:true;
        }
        else{
            boolean varab=(ispartition(arr,n-1,sum-arr[n]) || ispartition(arr,n-1,sum));
            if(varab){
            	dp[n][sum]=1;
            }
            else{
            	dp[n][sum]=0;
            }
            return varab;
        }

    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    int sum=0;
	    for(int i=0;i<n;i++){
	       arr[i]=in.nextInt();
	       sum+=arr[i];
	    }
	    if(sum%2!=0){
	       System.out.println("false");
	    }
	    else{
	    dp=new int[n][sum+1];
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<=sum/2;j++){
	    		dp[i][j]=-1;
	    	}
	    }
	      System.out.println(ispartition(arr,n-1,sum/2));
	  }
	      
	}
}