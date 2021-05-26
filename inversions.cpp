#include<bits/stdc++.h>
using namespace std;
int fun(map<int,int> mp,int x){
    int sum=0;
    int j;
    int count=0,y;
	for(int i=1;i<=x;i++){
	   j=i-1;
	   y=mp.at(i);
	   count=0;
	    while(j>0){
           if(mp.at(j)>y){
           count++;

           }
           sum=sum+count;
           j--;

	    }

	}
	return sum;
}
int main(){
	int n;
	cin>>n;
	int fin[n];
	long long p;
	for(int i=0;i<n;i++){
	   map<int,int> mp;
	   int x;
	   cin>>x;
	   for(int j=0;j<x;j++){
	   cin>>p;
	     mp.insert(pair<int,int>(p,i));

	   }
       fin[i]=fun(mp,x);
	}
	for(int i:fin){
		cout<<i<<endl;
	}
}