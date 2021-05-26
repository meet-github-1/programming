import java.util.*;
import java.lang.*;
class bharath{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        if(n==1){
            System.out.println(arr[0]);
        }
        else if(n==2){
            System.out.println(Math.max(arr[0],arr[1]));
        }
        else{
            dp[0]=arr[0];
            dp[1]=arr[1];
            dp[2]=arr[0]+arr[2];
            for(int i=3;i<n;i++){
                dp[i]=Math.max(dp[i-3],dp[i-2])+arr[i];
            }
            System.out.println(Math.max(dp[n-1],dp[n-2]));
            
        }
        
    }
}