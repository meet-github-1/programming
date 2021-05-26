import java.util.*;
import java.lang.*;
import java.io.*;
class lift{
    static int maxpeople(int arr[],int w,int n){
        if(n<0 || w==0){
            return 0;
        }
        else if(arr[n]<=w){
            return Math.max(1+maxpeople(arr,w-arr[n],n-1),maxpeople(arr,w,n-1));
        }
        else{
            return(maxpeople(arr,w,n-1));
        }
        
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=in.nextInt();
	}
	System.out.println(maxpeople(arr,500,n-1));
	
	}
}