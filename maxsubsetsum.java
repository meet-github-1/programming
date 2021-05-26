import java.util.*;
import java.lang.*;
class maxsubsetsum{
  static int MIN=-9999;
   static int getmaxsub(int arr[],int n,int sum){
        if(n<0){
           return MIN;
        }
        else if(sum==0){
            return 0;
        }
        else{
           return Math.max(1+getmaxsub(arr,n-1,sum-arr[n]),getmaxsub(arr,n-1,sum));
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
	   System.out.println(1+getmaxsub(arr,n-1,sum));
	}
}