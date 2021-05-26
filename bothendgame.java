import java.util.*;
import java.lang.*;
class bothendgame{
    static int dp[][];
    static int getmax(int arr[],int st,int ed){
          if(st==ed){
             return arr[st];
          }
          else if(ed==st+1){
             return Math.max(arr[st],arr[ed]);
          }
          else if(dp[st][ed]!=0){
             return dp[st][ed];
          }
          else{
            dp[st][ed]=Math.max(arr[st]+Math.min(getmax(arr,st+2,ed),getmax(arr,st+1,ed-1)),arr[ed]+Math.min(getmax(arr,st+1,ed-1),getmax(arr,st,ed-2)));
            return dp[st][ed];
          }
    }
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       dp=new int[n][n];
       for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
       }
       System.out.println(getmax(arr,0,n-1));
    }
}