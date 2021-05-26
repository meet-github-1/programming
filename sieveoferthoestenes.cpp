#include<bits/stdc++.h>
using namespace std;
int main(){
     int n;
     cin>>n;
     bool arr[n+1];
     memset(arr,true,n+1);
     for(int p=2;p*p<=n;p++){
       if(arr[p]==true){
            for(int i=p*p;i<=n;i+=p){
               arr[i]=false;
            }
       }
     }
     for(int i=2;i<=n;i++){
         if(arr[i]==true){
            cout<<i<<" ";
         }
     }
	
}