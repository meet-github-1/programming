#include<bits/stdc++.h>
using namespace std;
int dp[100][100];
int noofsubarray(int arr[],int ind,int sum,int csum,int n){
	if(sum==csum){
		return 1;
	}
	if(dp[csum][ind]!=-1){
	   return dp[csum][ind];
	}
	else{
	    dp[csum][ind]=0;
	    for(int i=ind;i<n;i++){
	         if(arr[i]<=sum){
	           dp[csum][ind]+=noofsubarray(arr,i+1,sum,csum+arr[i],n);
	         }
	        // cout<<dp[csum][ind]<<endl;
	         //cout<<ind<<i<<endl;
	    }
	    return dp[csum][ind];
	}
}
int main(){
	int n,sum;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
	cin>>arr[i];
	}
	cin>>sum;
	//cout<<"manmeet in main before memset"<<endl;
	for(int i=0;i<100;i++){
		for(int j=0;j<100;j++){
			dp[i][j]=-1;
		}
	}
	//cout<<"manmeet in main"<<endl;
	cout<<noofsubarray(arr,0,sum,0,n)<<endl;
}