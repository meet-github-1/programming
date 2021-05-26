import java.util.*;
import java.lang.*;
class uglynumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n2=2,n3=3,n5=5;
        int i2=0,i3=0,i5=0;
        n--;
        int dp[]=new int[n+1];
        int i=0;
        dp[i]=1;
        i++;
        while(n-->0){
            //System.out.println(i+" "+i2+" "+i3);
             dp[i]=Math.min(n2,n3);
             dp[i]=Math.min(dp[i],n5);
             if(dp[i]==n2){
                 i2++;
                 n2=2*dp[i2];
                 
             }
              if(dp[i]==n3){
                 i3++;
                 n3=3*dp[i3];
                 
             }
              if(dp[i]==n5){
                 i5++;
                 n5=5*dp[i5];
                 
             }
             i++;
             System.out.println(n2+" "+n3+" "+n5);
        }
        System.out.println(dp[i-1]);
    }
}