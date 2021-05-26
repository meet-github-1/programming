import java.util.*;
import java.lang.*;
class arithmetic{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(int i=2;i<n;i++){
            if(arr[i]-arr[i-1]==arr[i-1]-arr[i-2]){
                dp[i]=dp[i-1]+1;
                sum+=dp[i];
            }
        }
        System.out.println(sum);
    }
}