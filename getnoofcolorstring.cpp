#include<bits/stdc++.h>
using namespace std;
int getcolorstring(int n,int r,int g,int b){
	  int fact[n+1];
	  fact[0]=1;
	  for(int i=1;i<=n;i++){
	      fact[i]=i*fact[i-1];
	  }
	  int left=n-(r+g+b);
	  int sum=0;
	  for(int i=0;i<=left;i++){
	       for(int j=0;j<=(left-i);j++){
	          int k=left-(i+j);
              sum+=fact[n]/(fact[i+r]*fact[j+g]*fact[k+b]);
	       }
	  }
	  return sum;
}
int main(){
     int n,r,g,b;
     cin>>n>>r>>g>>b;
	 cout<<getcolorstring(n,r,g,b)<<endl;
}