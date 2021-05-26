#include<iostream>
#include<numeric>
#include<algorithm>
using namespace std;
int getmin(int x,int y){
	if(x<y) return x;
	return y;
}
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
	int count=0;
	if(mintimesum<=tr && tr<=maxtimesum){
	   for(int i=0;i<d;i++){
	      int t=getmin((min[i]+tr-mintimesum),max[i]);
	      printf((i+1<d ?"%d ":"%d\n"),t);
	      count++;
	      tr-=(t-min[i]);
	   }
	   cout<<count<<endl;

	}
	else{
	   cout<<"0"<<endl;
	}
}