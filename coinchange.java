import java.util.*;
import java.lang.*;
class coinchange{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s[]=in.nextLine().split(" ");
        int arr[]=Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        int sum=in.nextInt();
        int dp[]=new int[sum+1];
        int len=arr.length;
        for(int i=1;i<=sum;i++){
            dp[i]=INTEGER.MAX_VALUE;
            for(int j=0;j<len;j++){
                if(i>=arr[j]){
                    dp[i]=Math.min(dp[i],dp[i-arr[j]]+1);
                }
            }
        }
        if(dp[sum-1]!=INTEGER.MAX_VALUE){
            System.out.println(dp[sum-1]);
            System.exit(1);
        }
        System.out.println(-1);
    }
}