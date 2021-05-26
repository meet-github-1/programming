#include <iostream>
using namespace std;
int fun(string s){
    for(int i=s.length()-1;i>=0;i--){
        if(s[i]=='1'){
            return i;
        }
    }
    return -1;
}
int main() {
	//code
	int n;
	cin>>n;
	int fin[n];
	for(int i=0;i<n;i++){
	    string s;
	    cin>>s;
	    fin[i]=fun(s);
	}
	for(int i:fin){
	    cout<<i<<endl;
	}
	return 0;
}