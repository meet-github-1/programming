import java.util.*;
import java.lang.*;
import java.io.*;
class search{
    static int searchsplit(int arr[],int low,int high){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<arr[mid-1]) return mid;
            else if(arr[mid]-arr[0]<0){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    }
    static int binarysearch(int arr[],int low,int high,int s){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==s) return mid;
            else if(arr[mid]<s){
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=in.nextInt();
	}
	int diff=searchsplit(arr,0,n-1);
	//System.out.println(diff);
	int given=in.nextInt();
	int var=-1;
	if(given<arr[0]){
	   var=binarysearch(arr,diff,n-1,given);
	   //System.out.println(diff+" "+(n-1));
	}
	else{
	    var=binarysearch(arr,0,diff-1,given);
	    //System.out.println(0+" "+(diff-1));
	}
	System.out.println(var);
	
	}
}