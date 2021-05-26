import java.util.*;
import java.lang.*;
class gamechin{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int dp[]=new int[100];
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            dp[e.getKey()]=e.getKey()*e.getValue();
        }
        int mx=Integer.MIN_VALUE;//p
        for(int i=2;i<100;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+dp[i]);
        }
        System.out.println(dp[99]);
    }
}