import java.util.*;
import java.lang.*;
class maxsubarray{
    static int getmidmax(int arr[],int mid,int low,int high){
        int mx1=0;
        int sum=0;
        for(int i=mid-1;i>=low;i--){
            if(mx1==0){
                mx1=arr[i];
                sum=arr[i];
            }
            else{
                sum=sum+arr[i];
                mx1=Math.max(sum,mx1);
            }
            //System.out.println("mx1"+" "+arr[i]+" "+mx1);
        }
        int mx2=0;
        sum=0;
        for(int i=mid+1;i<=high;i++){
            if(mx2==0){
                mx2=arr[i];
                sum=arr[i];
            }
            else{
                sum=sum+arr[i];
                mx2=Math.max(sum,mx2);
            }
            //System.out.println("mx2"+" "+arr[i]+" "+mx1);
        }
        //System.out.println("getmidmax"+" "+mx1+" "+mx2+" "+arr[mid]);
        return arr[mid]+mx1+mx2;
    }
    static int max(int arr[],int low,int high){
        if(low>=high){
            return arr[low];
        }
        else{
            int mid=(low+high)/2;
            int max1=max(arr,low,mid-1);
            int max2=max(arr,mid+1,high);
            int max3=getmidmax(arr,mid,low,high);
            //System.out.println(mid+" "+max1+" "+max2+" "+max3);
            return Math.max(max1,Math.max(max2,max3));
        }
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max(arr,0,n-1));
    }
}