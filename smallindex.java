import java.util.*;
import java.lang.*;
class smallindex{
    static int minind;
    static void binary(int arr[],int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==mid){
                minind=Math.min(minind,mid);
            }
            if(arr[mid]<mid){
                binary(arr,mid+1,high);
            }
            else{
                binary(arr,low,mid-1);
            }
        }
        return;
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	       arr[i]=in.nextInt();
	   }
	   minind=Integer.MAX_VALUE;
	   binary(arr,0,n-1);
	   System.out.println(minind);
	}
}