#include<stdio.h>
#include<stdlib.h>
struct node{
	int dist[20];
	int from[20];
}route[20];
int main(){
	int dm[20][20],no,i,j,k;
	printf("enter no of nodes");
	scanf("%d",&no);
	pritnf("enter the distance matrix:\n");
	for(i=0;i<no;i++){
	  for(j=0;j<no;j++){
	      scanf("%d",&dm[i][j]);
	      dm[i][i]=0;
	      route[i].dist[j]=dm[i][j];
	      route[i].from[j]=j;
	  }
	}
	int flag;
	do{
	    flag=0;
	    for(i=0;i<no;i++){
	      for(j=0;j<no;j++){
	        for(k=0;k<no;k++){
	            if(route[i].dist[j]>(route[i].dist[k]+route[k].dist[i])){
	               route[i].dist[j]=route[i].dist[k]+route[k].dist[j];
	               route[i].from[j]=k;
	               flag=1;
	               }
	        }
	      }
	    }
	}while(flag);
	for(i=0;i<no;i++){
	   printf("route info for router:%d\n",i+1);
	   printf("Dest\tNext Hop\tDist \n");
	   for(j=0;j<no;j++){
	         printf("%d\t%d\t\t%d\n",j+1,route[i].from[j]+1,route[i].dist[j]);
	   }
	}
    return 0;
}