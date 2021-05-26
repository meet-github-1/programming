/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class knapsack01{
	static int dp[][];
    static int getmax(int wt[],int val[],int cap,int n){
        if(n<0 || cap<=0){
            return 0;
        }
        if(dp[n][n]!=-1){
            return dp[n][n];
        }
        else{
            if(wt[n]<=cap){
                return Math.max(val[n]+getmax(wt,val,cap-wt[n],n-1),getmax(wt,val,cap,n-1));
            }
            return getmax(wt,val,cap,n-1);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		int n=in.nextInt();
		int cap=in.nextInt();
		int val[]=new int[n];
		int wt[]=new int[n];
		dp=new int[n][n];
		for(int i=0;i<n;i++){
		    val[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    wt[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        dp[i][j]=-1;
		    }
		}
		System.out.println(getmax(wt,val,cap,n-1));
	}
	}
}