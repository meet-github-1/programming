#include <bits/stdc++.h>
using namespace std;
int getmin(int arr[],int len,int mx){
    sort(arr,arr+len);
    for(int i=0;i<len;i++)
       cout<<arr[i]<<" ";
   cout<<endl;
    int p=mx-1;
    int max=99999,diff;
    for(int i=0;i<=(len-mx);i++){
        diff=arr[i+p]-arr[i];
        //cout<<arr[i+p]<<"-"<<arr[i]<<" "<<diff<<endl;
        if(diff<max){
            max=diff;
            
        }
        
        
    }
    //p
    return max;
    
}
int main() {
	//code
	int n;
	cin>>n;
	int fin[n];
	for(int i=0;i<n;i++){
	    int len;
	    cin>>len;
	    int arr[len];
	    for(int j=0;j<len;j++){
	        cin>>arr[j];
	    }
	    int mx;
	    cin>>mx;
	    fin[i]=getmin(arr,len,mx);
	    
	}
	for(int i=0;i<n;i++){
	    cout<<fin[i]<<endl;
	}
	return 0;
}