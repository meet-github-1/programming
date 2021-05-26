import java.util.*;
import java.lang.*;
class maxminimums{
    static int MAX=9999;
    static int MIN=-9999;
    static int maxminim(int arr[],int n,int ind){
        if(ind==n){
           return 0;
        }
        else{
           int sum=0;
           int min=MAX;
           int max=MIN;
           for(int i=ind;i<n;i++){
              sum+=arr[i];
              min=Math.min(sum,maxminim(arr,n,i+1));
              max=Math.max(max,min);
            }
            return max;
        }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();
	   }
	   System.out.println(maxminim(arr,n,0));
	}
}