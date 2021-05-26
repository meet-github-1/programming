#include<iostream>
#include<numeric>
#include<algorithm>
using namespace std;
int main(){
	int d,c,tr,min[100],max[100];
	cin>>d>>c>>tr;
	int minlimit=1;
	int maxlimit=c;
	for(int i=0;i<d;i++){
	   min[i]=minlimit;
	   max[i]=maxlimit;

	}
	int mintimesum=minlimit*d;
	int maxtimesum=maxlimit*d;
	if(mintimesum<=tr && tr<=maxtimesum){
	   for(int i=0;i<d;i++){
	      int t=min(min[i]+tr-mintimesum,max[i]);
	      count++;
	      tr-=(t-min[i]);
	   }

	}
	else{
	   cout<<"0"<<endl;
	}
}