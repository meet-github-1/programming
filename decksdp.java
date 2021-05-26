import java.util.*;
import java.lang.*;
class deckdp{
     static int dp[][];
     static int noofways(int d,int c,int tr){
           if(tr==0){
           	   return 1;
           }
           else if(d<0){
              return 0;
           }
           else if(dp[d][tr]!=-1){
               return dp[d][tr];
           }
           else{
           	   for(int i=1;i<=c;i++){
                     dp[d][tr]+=noofways(d-1,c,tr-i);
           	   }
           	   return dp[d][tr];
           }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int d=in.nextInt();
	   int c=in.nextInt();
	   int tr=in.nextInt();
	   dp=new int[d][tr+1];
	   for(int i=0;i<d;i++){
	      for(int j=0;j<tr;j++){
	         dp[i][j]=-1;
	      }
	   }
	   System.out.println(noofways(d,c,tr));
	}
}