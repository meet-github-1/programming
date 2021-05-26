#include <iostream>
using namespace std; 
int main() {
	//code
	int n;
	int dp[100000];
	dp[0]=0;
	dp[1]=1;
	cin>>n;
	int sum,div;
	while(n--){
	    int x;
	    cin>>x;
	    sum=1;
	    for(int i=2;i<=x;i++){
	        div=int(i/2);
	        if(i%2==0){
	            dp[i]=dp[div];
	            sum=sum+dp[i];
	        }
	        else{
	            dp[i]=dp[div]+1;
	            sum=sum+dp[i];
	        }
	        //cout<<i<<endl;
	    }
	    cout<<sum<<endl;
	}
	return 0;
}