#include<bits/stdc++.h>
using namespace std;
vector <int> bfs(vector<int> g[], int N) {

    // Your code here
    bool vis[N];
    memset(vis,false,N);
    queue<int> q;
    q.push(0);
    int start;
    vector<int> bf;
    while(!q.empty()){
        start=q.front();
        //cout<<start<<endl;
        bf.push_back(start);
        q.pop();
        if(!vis[start]){
            vis[start]=true;
        }
        for(int z=0;z<g[start].size();z++){
            if(!vis[g[start][z]]){
                //cout<<start<<" "<<g[start][z]<<endl;
                q.push(g[start][z]);
                vis[g[start][z]]=true;
            }
        }
        
        
    }
    return bf;
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
     vector<int> res=bfs(g,N);
     for(int i=0;i<res.size();i++){
       cout<<res[i]<<" ";
     }
     cout<<endl;
    }
}