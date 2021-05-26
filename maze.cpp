#include<bits/stdc++.h>
using namespace std;
#define MAX 5
vector<string> printPath(int m[MAX][MAX],int n);
int main(){
    int t;
    cin>>t;
    while(t--){
      int n;
      cin>>n;
      int m[MAX][MAX];
      for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         cin>>m[i][j];
      }
      }
      vector<string> result=printPath(m,n);
      if(result.size()==0){
        cout<<-1;
    }
      else{
      for(int i=0;i<result.size();i++){
        cout<<result[i]<<" ";
    }
      cout<<endl;
      }
    }
}
void maze(int [MAX][MAX],int ,int ,int ,string,vector<string>&);
vector<string> printPath(int m[MAX][MAX], int n) {
    // Your code goes here
    vector<string> out;
    if(m[n-1][n-1]==0) return out; 
    maze(m,n,0,0,"",out);
    sort(out.begin(),out.end());
    return out;
    
    
}
void maze(int m[MAX][MAX],int n,int x,int y,string s,vector<string>&vec){
    if(x==n-1 && y==n-1){
        vec.push_back(s);
        return ;
    }
    if(x<0 || y<0 || x>=n || y>=n || m[x][y]==0){
        return ;
    }
    else{
        m[x][y]=0;
        maze(m,n,x-1,y,s+"U",vec);
        maze(m,n,x+1,y,s+"D",vec);
        maze(m,n,x,y-1,s+"L",vec);
        maze(m,n,x,y+1,s+"R",vec);
        m[x][y]=1;
        return ;
    }
}
