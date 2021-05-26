import java.util.*;
import java.lang.*;
class maxproduct{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
        int ind=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]>mx1){
                mx1=arr[i];
                ind=i;
            }
        }
        arr[ind]=mx2;
        for(int i:arr){
            if(i>mx2){
                mx2=i;
            }
        }
        System.out.println((mx1-1)*(mx2-1));
        
    }
}