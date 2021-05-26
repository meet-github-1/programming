#include<bits/stdc++.h>
using namespace std;
int getmiddleaverage(int arr1[],int arr2[],int x){
	int totlen=x*2;
	int mid1=totlen/2;
	int mid2=totlen/2+(1);
	
}
int main(){
	int n;
	cin>>n;
	while(n--){
	   int x;
	   cin>>x;
	   int arr1[x];
	   int arr2[x];
	   for(int i=0;i<x;i++) cin>>arr1[i];
	   for(int i=0;i<x;i++) cin>>arr2[i];
	   	cout<<getmiddleaverage(arr1,arr2,x);
	}
}