import java.util.*;
import java.lang.*;
import java.io.*;
class perfectsum{
    static int dp[];
    static int getminperfect(int n){
        if(n<=3){
             return n;
        }
        else{
            for(int i=4;i<=n;i++){
                dp[i]=i;
                int min=(int)Math.ceil(Math.sqrt(i));
            for(int j=1;j<=min;j++){
                int sq=j*j;
                if(sq>i) break;
                else{
                    dp[i]=Math.min(dp[i],1+dp[i-sq]);
                }
            }
            }
            return dp[n];
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    dp=new int[n+1];
	    dp[0]=0;dp[1]=1;dp[2]=2;dp[3]=3;
	    System.out.println(getminperfect(n));
	}
}