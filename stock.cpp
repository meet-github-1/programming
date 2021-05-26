#include<bits/stdc++.h>
using namespace std;
string getstring(int arr[],int x){
    string s="";
    int flag=0;
	for(int i=1;i<x;i++){
	    if(arr[i-1]<arr[i]){
	        s=s+"("+to_string(i-1)+" ";
	        i++;
	        while(i<x){
	            if(arr[i-1]<arr[i]) i++;
	            else break;
	        }
	        s=s+to_string(i-1)+")"+" ";
	        flag=1;
	    }
		


	}
	if(flag==0){
		return "No Profit";
	}
	return s;
}
int main(){
	int n;
	cin>>n;
	string fin[n];
	for(int i=0;i<n;i++){
		int x;
		cin>>x;
		int arr[x+1];
		for(int j=0;j<x;j++){
			cin>>arr[j];
		}
		arr[x]=-1;
		fin[i]=getstring(arr,x);
	}
	for(string s:fin){
	   cout<<s<<endl;
	}
}