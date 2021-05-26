import java.util.*;
import java.lang.*;
class online{
    static int dp[];
    static int startpay(int n,int cost[],int st){
        if(st>=n){
            return 0;
        }
        if(dp[st]!=0){
            return dp[st];
        }
        else{
            for(int i=st;i<n;i++){
                dp[st]=Math.min(cost[st]+startpay(n,cost,st+1),cost[st]+startpay(n,cost,st+2));
            }
            return dp[st];
        }
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cost[]=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=in.nextInt();
        }
        dp=new int[n];
        System.out.println(Math.min(startpay(n,cost,0),startpay(n,cost,1)));
    }
}