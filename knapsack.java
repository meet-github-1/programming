import java.util.*;
import java.lang.*;
class knapsack{
	static int dp[];
   static int getmax(int arr[],int cap,int n){
       if(cap==0){
            return 0;
       }
       if(dp[cap]!=0){
       	   return dp[cap];
       }
       else{
          int mx=0; 
           for(int i=0;i<n;i=i+2){
           	if(arr[i]==0 && arr[i+1]>0){
           		mx=Integer.MAX_VALUE;
           		break;
           	}
             if(arr[i]<=cap && arr[i]!=0){
                 	//System.out.println(cap);
                     mx=Math.max(mx,arr[i+1]+getmax(arr,cap-arr[i],n));
                 }
           }
           dp[cap]=mx;
           return dp[cap];
       }
   }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int arr[]=new int[n*2];
	 for(int i=0;i<n*2;i++){
	     arr[i]=in.nextInt();
	 }
	 int cap=in.nextInt();
	 dp=new int[cap+1];
	 System.out.println(getmax(arr,cap,n*2));
	}
}