#include<bits/stdc++.h>
using namespace std;
int main(){
   int n;
   int x,y,x1,y1;
   cin>>n;
   for(int i=0;i<n;i++){
    cin>>x>>y;
    cin>>x1>>y1;
    string s="No";
    if(x==x1){
        if(y+y1==x){
           s="Yes";
        }
       else{
           s="No";
           }
      }
    if(x==y1 && s.compare("No")==0){
        if(x1+y==x){
           s="Yes";
        }
        else{
          s="No";
       }
    }
    if(y==x1 && s.compare("No")==0){
       if(x+y1==y){
           s="Yes";
        }
        else{
           s="No";
        }
    }
    if(y==y1 && s.compare("No")==0){
      if(x+x1==y){
           s="Yes";
        }
       else{
         s="No";
       }
      
    }
   cout<<s<<endl;
 
     
}
 
}