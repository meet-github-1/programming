import java.util.*;
import java.lang.*;
class minimizemax{
   static int dp[][];
   static int MAX=99999;
   static int minmax(int arr[],int n,int ind,int k){
       if(k==0){
           if(ind==n){
               return 0;
           }
           else{
              return MAX;
           }
       }
       else if(ind==n){
           return MAX;
       }
       else if(dp[ind][k]!=-1){
          return dp[ind][k];
       }
       else{
          int ans=9999;
          int max=arr[ind];
          for(int i=ind;i<n;i++){
             max=Math.max(arr[i],max);
             ans=Math.min(ans,minmax(arr,n,i+1,k-1)+max);
          }
          dp[ind][k]=ans;
          return dp[ind][k];
       }
   }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	      arr[i]=in.nextInt();
	    }
	    int k=in.nextInt();
	   dp=new int[n][k+1];
	   for(int i=0;i<n;i++){
	   	 for(int j=0;j<=k;j++){
	   	 	dp[i][j]=-1;
	   	 }
	   }
	   int as=minmax(arr,n,0,k);
	   int pr=as==9999?-1:as;
	    System.out.println(pr);
	}
}