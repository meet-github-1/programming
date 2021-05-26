import java.util.*;
import java.lang.*;
class minmaximums{
    static int minmaxim(int arr[],int n,int ind,int k){
          int mid=0;
          int sum=0;
          int count=0;
          int ans=0;
          int flag=0;
          while(ind<=k){
            mid=(ind+k)/2;
            count=0;
            sum=0;
            flag=0;
            for(int i=0;i<n;i++){
              if(arr[i]>mid){
                flag=1;
                break;
              }
              else{
                sum+=arr[i];
                if(sum>mid){
                  sum=arr[i];
                  count++;
                }
              }
            }
            count++;
            if(count<=k && flag==0){
              ans=mid;
              k=mid-1;
            }
            else{
              ind=mid+1;
            }
          }
          return ans;

    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();
	   }
	   int k=in.nextInt();
     int sum=0;
     for(int i:arr){
        sum+=i;
     }
	   System.out.println(minmaxim(arr,n,1,sum));
     
	}
}