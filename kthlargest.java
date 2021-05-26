import java.util.*;
import java.lang.*;
class kthlargest{
    static void swap(int arr[],int ind1,int ind2){
       int temp=arr[ind1];
       arr[ind1]=arr[ind2];
       arr[ind2]=temp;
    }
    static int part(int arr[],int low,int high){
      int ele=arr[high];
      int ind=low;
      for(int i=low;i<high;i++){
        if(arr[i]<=ele){
           swap(arr,ind,i);
           ind++;
        }
      }
      swap(arr,ind,high);
      return ind;
    }
    static int findele(int arr[],int low,int high,int k){
      if(low>=high){
       return arr[low]; 
      }
      else{
        int pos=part(arr,low,high);
        if(pos-low==k-1){
          return arr[pos];
        }
        else if(pos-low>k-1){
           return findele(arr,low,pos-1,k);
        }
        else{
           return findele(arr,pos+1,high,k-pos+low-1);
        }
      }
    }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();
	  }
    int k=in.nextInt();
    if(k>0 && k<=n){
	    System.out.println(findele(arr,0,n-1,k));
    }
	}
}