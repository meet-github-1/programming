import java.util.*;
import java.lang.*;
class baskets{
    static int dp[][];
    static int findmax(int arr[],int st,int ed,int k){
        if(k==0){
            return 0;
        }
        else if(dp[st][ed]!=-1){
            return dp[st][ed];
        }
        else{
            dp[st][ed]=Math.max(arr[st]+findmax(arr,st+1,ed,k-1),arr[ed]+findmax(arr,st,ed-1,k-1));
            return dp[st][ed];
            
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        dp=new int[n][n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(findmax(arr,0,n-1,k));
    }
}