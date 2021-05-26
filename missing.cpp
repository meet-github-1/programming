#include<bits/stdc++.h>
#include<string>
using namespace std;
string getduplicate(int arr[],int len){
	  string s="";
	  map<int,int> mp;
	  map<int,int>::iterator it;
	  long long sum=0;
	  for(int i=0;i<len;i++){
	          it=mp.find(arr[i]);
	          if(it!=mp.end()){
	               s=s+" "+to_string(arr[i]);
	               continue;
	          }
	          mp.insert(pair<int,int>(arr[i],1));
	          sum=sum+i;

	  }
	  double d=double(len);
	  long long x=(d*((d+1)/2));
	  return s+to_string(x-sum);

}
int main(){
	int n;
	cin>>n;
	string fin[n];
	for(int i=0;i<n;i++){
	    int len;
	    cin>>len;
	    int arr[len];
	    for(int j=0;j<len;j++){
	    cin>>arr[j];
	    }
	    fin[i]=getduplicate(arr,len);
	}
	for(int i=0;i<n;i++){
	    cout<<fin[i]<<endl;
	}
}