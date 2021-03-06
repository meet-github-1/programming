import java.util.*;
import java.lang.*;
class mincoin{
	static int fun(int arr[],int n,int r){
		int dp[]=new int[r+1];
		dp[0]=0;
		for(int i=1;i<=r;i=i+1){
			dp[i]=Integer.MAX_VALUE;
			int res=Integer.MAX_VALUE;
			for(int i1=0;i1<n;i1=i1+1){
				if((i-arr[i1])>=0){
					res=dp[i-arr[i1]];
				}
				if(res!=Integer.MAX_VALUE){
					dp[i]=Math.min(dp[i],1+res);
				}
			}
		}
		return dp[r];
	}


    public static void main(String[] args){
         Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i=i+1){
			arr[i]=in.nextInt();
		}
		int r=in.nextInt();
		System.out.println(fun(arr,n,r));
	}
}

