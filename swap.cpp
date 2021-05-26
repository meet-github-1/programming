#include <bits/stdc++.h>
using namespace std;
int getMinSwaps1(int *arr,int n){
    vector< pair<int,int> > vec(n);
   for (int i = 0; i < n; ++i) {
      vec[i].first = arr[i];
      vec[i].second = i;
   }
   sort(vec.begin(), vec.end(),greater<int>());
   int cnt = 0;
   for (int i = 0; i < n; ++i) {
      if (vec[i].second == i) {
         continue;
      }
      swap(vec[i].first,vec[vec[i].second].first);
      swap(vec[i].second,vec[vec[i].second].second);
      if (i != vec[i].second) {
         --i;
      }
         ++cnt;
   }
   
   return cnt;
    
}
int getMinSwaps(int *arr, int n) {
   vector< pair<int, int> > vec(n);
   for (int i = 0; i < n; ++i) {
      vec[i].first = arr[i];
      vec[i].second = i;
   }
   sort(vec.begin(), vec.end());
   int cnt = 0;
   for (int i = 0; i < n; ++i) {
      if (vec[i].second == i) {
         continue;
      }
      swap(vec[i].first,vec[vec[i].second].first);
      swap(vec[i].second,vec[vec[i].second].second);
      if (i != vec[i].second) {
         --i;
      }
         ++cnt;
   }
   
   return cnt;
}
int main() {
   int n;
   cin>>n;
   int arr[n];
   for(int i=0;i<n;i++){
       cin>>arr[i];
   }
   int min1=getMinSwaps(arr,n);
   int min2=getMinSwaps1(arr,n);
   cout<<min(min1,min2)<<endl;
}