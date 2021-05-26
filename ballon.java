import java.util.*;
import java.lang.*;
class balloon{
    static long mod;
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        mod=(long)Math.pow(10,9)+7;
        long dp1[]=new long[n];
        long dp2[]=new long[n];
        long res[]=new long[n];
        dp1[0]=6;
        dp2[0]=6;
        res[0]=(dp1[0]+dp2[0])%mod;
        for(int i=1;i<n;i++){
            dp1[i]=3*dp1[i-1]+2*dp2[i-1];
            dp2[i]=2*dp1[i-1]+2*dp2[i-1];
            res[i]=(dp1[i]+dp2[i])%mod;
        }
        System.out.println(res[n-1]);
    }
}