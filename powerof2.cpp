#include <iostream>
using namespace std;

int main() {
	//code
	int n;
	cin>>n;
	while(n--){
	    long long int x;
	    cin>>x;
	    long long int res=x & (x-1);
	    cout<<res<<endl;
	    if(res==0) cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
	return 0;
}