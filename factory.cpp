#include<bits/stdc++.h>
#include<math.h>
#include<string.h>
using namespace std;
/*int getgcd(int x,int y){
  if(x==1 ||  y==1){
        return 1;
    }
    else if(x==y){
         return x;
     }
    else if(x>y){
        return getgcd(x-y,y);
     }
     else{
         return getgcd(x,y-x);
    } 
}
bool checkpow2(int x){
	return (x && (!(x &(x-1))));
}*/
string fa(int n,int m){
	int x=n;
	while(n<(x*m)){
	 	if(n%m==0){
	 		return "Yes";
	 	}
	 	n=n+(n%m);
	 }
	 return "No";
}
int main(){
	 int n,m;
	 cin>>n>>m;
	cout<<fa(n,m)<<endl;
      
    
}