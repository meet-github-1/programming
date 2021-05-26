import java.util.*;
import java.lang.*;
class subsetprod{
    static int numberofsub(int arr[],int ind,int n,int a,int b,int prod){
          if(ind==n){
              if(prod%(a*b)==0){
                 return 1;
              }
              return 0;
          }
          else{
              int sum1=0;
              sum1=sum1+numberofsub(arr,ind+1,n,a,b,prod*arr[ind]);
              sum1=sum1+numberofsub(arr,ind+1,n,a,b,prod);
              return sum1;
          }
    }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int a=in.nextInt();
	  int b=in.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();
	  }
	  System.out.println(numberofsub(arr,0,n,a,b,1));
	}
}