#include<bits/stdc++.h>
#include<string>
#include<math.h>
using namespace std;
long * getarraynumber(int arr[]){
	long *A=new long[arr[0]];
	long px=arr[2],py=arr[3];
	A[0]=(px+py)%arr[8];
	long x,y;
	for(int i=1;i<arr[0];i++){
        x=(px*arr[4]+py*arr[5]+arr[6])%arr[8];
        y=(py*arr[4]+px*arr[5]+arr[7])%arr[8];
        A[i]=(x+y)%arr[8];
        px=x;
        py=y;
	}
	return A;
}
long returnkpow(int kth,long arr[],int size){
	long fsum=0;
	for(int k=1;k<=size;k++){
	for(int i=0;i<=size-k;i++){
            int itr=0;
            int j=i;
            int po=1;
              while(itr<k){
             	fsum=fsum+arr[j]*pow(po,kth);
             	po++;
             	itr++;
             	j++;


             }
             //cout<<fsum<<endl;
         }
	}
	return fsum;
}
long getalarmpower(int k,long arr[],int size){
	long alpow=0;
	for(int i=1;i<=k;i++){
		alpow=alpow+returnkpow(i,arr,size);
		cout<<"alpow"<<alpow<<endl;


	}
	return alpow;

}
int main(){
	int arr[9];
	int n;
	cin>>n;
	for(int k=0;k<n;k++){
	  for(int i=0;i<9;i++){
	  	cin>>arr[i];
	  }
	  long *pi;
	  pi=getarraynumber(arr);
	  for(int j=0;j<arr[0];j++){
	  	cout<<pi[j]<<" ";

	  }	  
	  cout<<endl;
	  cout<<getalarmpower(arr[1],pi,arr[0])<<endl;
	}
   
}