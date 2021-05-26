import java.util.*;
import java.lang.*;
class partition{
    static boolean ispartition(int arr[],int n,int sum){
        if(sum==0){
           return true;
        }
        else if(n<0){
            return false;
        }
        else{
            return(ispartition(arr,n-1,sum-arr[n]) || ispartition(arr,n-1,sum));
        }

    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    int sum=0;
	    for(int i=0;i<n;i++){
	       arr[i]=in.nextInt();
	       sum+=arr[i];
	    }
	    if(sum%2!=0){
	       System.out.println("false");
	    }
	    else{
	      System.out.println(ispartition(arr,n-1,sum/2));
	    }
	}
}