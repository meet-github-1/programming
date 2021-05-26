#include<stdio.h>
int main(){
	int f[100],g[100],r[100],i,j,k,m,n,count=0,t[100];
	printf("enter the size of the frame:");
	scanf("%d",&n);
	printf("\n \n enter %d data bits:",n);
	for(i=0;i<n;i++){
	   scanf("%d",&f[i]);
	   t[i]=f[i];
	}
	printf("enter the size of divisior:",m);
	for(i=0;i<m;i++){
	   scamf("%d",&g[i]);
	}
	for(i=n;i<n+m-1;i++){
	  t[i]=0;
	}
	for(i=0;i<n;i++){
	 k=i;
	 if(t[i]==1){
	     for(j=0;j<m;j++;k++){
	          if(t[k]==g[j]){
	             t[k]=0;
	          }
	          else{
	            t[k]=1;
	          }
	     }
	 }
	 if(t[i]==0){
	     for(j=0;j<m;j++;k++){
	          if(t[k]==0){
	             t[k]=0;
	          }
	          else{
	            t[k]=1;
	          }
	     }
	 }
	}
	for(i=n;i<m+n-1;i++){
	   printf("%d",t[i]);
	}
	printf("\n \n enter received data:");
	for(i=0;i<m+n-1;i++){
	  scanf("%d",&r[i]);
	}
	for(i=0;i<n;i++){
	    k=i;
	    if(r[i]==1){
	        for(j=0;j<m;j++;k++){
	          if(r[k]==g[j]){
	            r[k]=0;
	          }
	          else{
	           r[k]=1;
	          }
	        }
	    }
	    if(r[i]==0){
	        for(j=0;j<m;j++;k++){
	          if(r[k]==0){
	            r[k]=0;
	          }
	          else{
	           r[k]=1;
	          }
	        }
	    }
	}
	for(i=n;i+m+n-1;i++){
	  printf("%d",r[i]);
	  if(r[i]!=0){
	    count=1;
	  }
	}
	if(count==1){
	   printf("\n\n error");
	}
	else{
	  printf("\n\n no error");
	}
}