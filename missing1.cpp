/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include<bits/stdc++.h>
#include<string>
using namespace std;
string getduplicate(int arr[],int len){
	  string s="";
	  map<int,int> mp;
	  //map<int,int>::iterator it;
	  int def[len+1]={0};
	  long long sum=0;
	  for(int i=0;i<len;i++){
	          //it=mp.find(arr[i]);
	          if(def[arr[i]]!=0){
	               s=s+to_string(arr[i]);
	               continue;
	          }
	          //mp.insert(pair<int,int>(arr[i],1));
	          def[arr[i]]=1;
	          sum=sum+arr[i];

	  }
	  //cout<<s<<endl;
	  double d=double(len);
	  long long x=(d*((d+1)/2));
	  //cout<<x<<sum<<endl;
	  return s+" "+to_string(x-sum);

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