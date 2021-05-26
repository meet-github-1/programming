import java.util.*;
import java.lang.*;
class maxminimums{
    static int MAX=9999;
    static int MIN=-9999;
    static int dp[][];
    static int maxminim(int arr[],int n,int ind,int k){
    if(k==0){
        if(ind==n){
           return MAX;
        }
        else{
        	return MAX;
        }
    }
     else if(ind==n){
      	 return MIN;
      }
      else if(dp[ind][k]!=-1){
      	 return dp[ind][k];
      }
        else{
           int sum=0;
           int min=MAX;
           int max=MIN;
           for(int i=ind;i<n;i++){
              sum+=arr[i];
              min=Math.min(sum,maxminim(arr,n,i+1,k-1));
              max=Math.max(max,min);
            }
            dp[ind][k]=max;
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
	   dp=new int[n][k+2];
	   for(int i=0;i<n;i++){
	   	 for(int j=0;j<k+2;j++){
	   	 	dp[i][j]=-1;
	   	 }
	   }
	   System.out.println(maxminim(arr,n,0,k+1));
	}
}