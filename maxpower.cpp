#include<bits/stdc++.h>
using namespace std;
int arr[10000000];
int arr1[10000000];
int main(){
	int n;
	cin>>n;
	int x;
	int min=INT_MAX;
	int max=INT_MIN;
	for(int i=0;i<n;i++){
	cin>>x;
	arr[x]=x+arr[x];
	arr1[x]=x+arr1[x];
	if(x>max){
	 max=x;
	}
	if(x<min){
	  min=x;
	}
	}
	int prev=0;
	int prev1=0;
	for(int i=min;i<=max;i++){
          if(arr[i]>0){
              prev1=arr[i];
              arr[i]=arr[i]+prev;
              prev=arr[i];
          }
          else{
             arr[i]=prev;
             arr1[i]=prev1;
          }

	}
	int rd;
	cin>>rd;
	int pow[rd];
	for(int i=0;i<rd;i++){
	    cin>>pow[i];
	}
	for(int i=0;i<rd;i++){
	     if(pow[i]<min){
	        cout<<"0 "<<"0"<<endl;
	     }
	     if(pow[i]>max){
	        cout<<arr1[max]<<" "<<arr[max]<<endl;
	     }
	     else{
	        cout<<arr1[pow[i]]<<" "<<arr[pow[i]]<<endl;
	     }

	}

	
}