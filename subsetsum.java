import java.util.*;
import java.lang.*;
class subsetsum{
    static boolean issubset(int arr[],int n,int sum){
          if(n<0){
             return false;
          }
          if(sum==0){
             return true;
          }
          else{
             return(issubset(arr,n-1,sum-arr[n]) || issubset(arr,n-1,sum));
          }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	      arr[i]=in.nextInt();
	   }
	   int sum=in.nextInt();
	   System.out.println(issubset(arr,n-1,sum));
	}
}