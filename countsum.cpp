#include <bits/stdc++.h>
using namespace std;
int count(int arr[],int x){
    sort(arr,arr+x);
    int j,k,sum,count=0;
    for(int i=x-1;i>=2;i--){
        j=i-1;
        k=0;
        while(j>k){
            sum=arr[j]+arr[k];
            if(sum==arr[i]) count++;
            else if(sum<arr[i]) k++;
            else j--;
        }
        
    }
    return count;
}
int main() {
	//code
	int n;
	cin>>n;
	int fin[n];
	for(int i=0;i<n;i++){
	    int x;
	    cin>>x;
	    int arr[x];
	    for(int j=0;j<x;j++){
	        cin>>arr[j];
	        
	    }
	    fin[i]=count(arr,x);
	}
	for(int i:fin){
	    cout<<i<<endl;
	}
	return 0;
}