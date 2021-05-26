import java.util.*;
import java.lang.*;
class decodenumbers{
   static int dp[];
   static int numDecodings(String s){
          int dp[]=new int[s.length()+1];
         dp[0]=1;
         dp[1]=s.charAt(0)=='0'?0:1;
         int len=s.length();
        int sum1=0,sum2=0;
         for(int i=1;i<len;i++){
             sum1=0;sum2=0;
             if(Integer.parseInt(s.substring(i-1,i+1))>=10 && Integer.parseInt(s.substring(i-1,i+1))<=26){
                 sum1=dp[i-1];
             }
             if(s.charAt(i)!='0'){
                 sum2=dp[i];
             }
             dp[i+1]=sum1+sum2;
         }
         return dp[len];
   }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  String s=in.next();
	  dp=new int[s.length()];
	  System.out.println(numDecodings(s));
	}
}