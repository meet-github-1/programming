#include<bits/stdc++.h>
using namespace std;
void traverse(vector<int> g[],int n,int start,vector<int> &df,bool vis[]){
    df.push_back(start);
    cout<<start<<endl;
    vis[start]=true;
    for(int z=0;z<g[start].size();z++){
        if(!vis[g[start][z]]){
            traverse(g,n,g[start][z],df,vis);
            
        }
    }
}
vector <int> dfs(vector<int> g[], int N)
{
    bool vis[N];
    memset(vis,false,N);
    vector<int> df;
   traverse(g,N,0,df,vis);
    return df;
    
    // Your code here
    

}
int main(){
    int T;
    cin>>T;
    while(T--){
      int N,E;
      cin>>N>>E;
      vector<int> g[N];
      bool vis[N];
     memset(vis,false,sizeof(vis));
     for(int i=0;i<E;i++){
       int u,v;
       cin>>u>>v;
       g[u].push_back(v);
       g[v].push_back(u);
     }
     vector<int> res=dfs(g,N);
     for(int i:res){
       cout<<i<<" ";
     }
     cout<<endl;
    }
}