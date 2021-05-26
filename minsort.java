import java.util.*;
import java.lang.*;
class minsort{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int st=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                st=i-1;
                break;
            }
        }
        int ed=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                ed=i+1;
                break;
            }
        }
        int max=-99999;
        int min=9999;
        for(int i=st;i<=ed;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        for(int i=0;i<st;i++){
            if(arr[i]>min){
                st=i;
                break;
            }
        }
        for(int i=n-1;i>ed;i--){
            if(arr[i]<max){
                ed=i;
                break;
            }
        }
        System.out.println((ed-st)+1);
    }
}