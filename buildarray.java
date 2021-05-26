import java.util.*;
import java.lang.*;
class buildarray{
   static int numberofarrays(int arr[],int ind,int n,int k){
       if(ind==n){
         if(arr[ind]!=arr[ind-1]){
           return 1;
           }
           return 0;
       }
       else{
          int sum=0;
          for(int i=1;i<=k;i++){
              if(i!=arr[ind-1]){
                 arr[ind]=i;
                 sum+=numberofarrays(arr,ind+1,n,k);
              }
          }
          return sum;
       }
   }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int k=in.nextInt();
	   int x=in.nextInt();
	   int arr[]=new int[n];
	   arr[0]=1;
	   arr[n-1]=x;
	   System.out.println(numberofarrays(arr,1,n-1,k));
	}
}