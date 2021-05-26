#include <iostream>
using namespace std;
bool overlap(int dm[],int dm1[]){
     if(dm[0]>dm1[2] || dm[2]<dm1[0]){
         return false;
     }
     if(dm[1]<dm1[3] || dm[3]>dm1[1]){
         return false;
     }
     return true;
}
int main() {
	//code
	int n;
	cin>>n;
	int dm[4],dm1[4];
	while(n-->0){
	   for(int i=0;i<4;i++)
	      cin>>dm[i];
	   for(int i=0;i<4;i++)
	        cin>>dm1[i];
	   cout<<overlap(dm,dm1)<<endl;
	}
	return 0;
}