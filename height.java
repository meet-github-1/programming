import java.util.*;
import java.lang.*;
class height{
    static int findclosest(int a,int b,int h){
          int dis1=h-a;
          int dis2=b-h;
          if(dis1<dis2){
            return 0;
          }
          else if(dis1>dis2){
            return 1;
          }
          return -1;
    }
    static int binarysearch(int arr[],int low,int high,int h){
      if(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==h){
             return h;
           }
           else if(arr[mid]<h){
             return binarysearch(arr,mid+1,high,h);
           }
           else{
              return binarysearch(arr,low,mid-1,h);
           }
      }
      else{
        int mid=(low+high)/2;
         if(arr[mid]<h){
           if(mid<h-1){
             int opt=findclosest(arr[mid],arr[mid+1],h);
             if(opt==0){
               return arr[mid];
             }
             else if(opt==1){
               return arr[mid+1];
             }
             else{
               return arr[mid+1];
             }
           }
           return -1;
         }
         else{
         	if(mid>0){
         		int opt=findclosest(arr[mid-1],arr[mid],h);
         		if(opt==0){
         			return arr[mid-1];
         		}
         		else if(opt==1){
         			return arr[mid];
         		}
         		return arr[mid];
         	}
         	return -1;
         }
      }
    }
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(binarysearch(arr,0,n-1,h));
	}
}