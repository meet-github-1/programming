#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	while(n--){
		priority_queue<int,vector<int>,greater<int>> pq;
		int x;
		cin>>x;
		int arr1[x];
		int arr2[1000];
		int ind=0;
		for(int i=0;i<x;i++){
			cin>>arr1[i];
			pq.push(arr1[i]);
		}
		while(!pq.empty()){
			arr2[pq.top()]=ind;
			ind++;
			pq.pop();
		}
		for(int i:arr1) cout<<arr2[i]<<" ";
		cout<<endl;


	}
}