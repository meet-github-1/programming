#include <stdio.h>

int main() {
	//code
	int t;
	long a,b;
	scanf("%d",&t);
	while(t--){
	    scanf("%li",&a);
	    scanf("%li",&b);
	    long sum=0;
	    while(a>0 && b>0){
	        sum+=a*b;
	        a--;
	        b--;
	    }
	    printf("%li\n",sum);
	    
	}
	return 0;
}