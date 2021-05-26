import java.util.*;
import java.lang.*;
class zee{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int v=in.nextInt();
        int arr[]=new int[n];//p
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int dp[]=new int[v+1];
        dp[0]=1;
        for(int val:arr){
            for(int i=val;i<=v;i++){
                 dp[i]+=dp[i-val];
            }
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(dp[v]);
    }
}