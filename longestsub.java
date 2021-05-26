import java.util.*;
import java.lang.*;
class longestsub{
  static int dp[][];
   static int getlong(String s1,String s2,int l1,int l2){
       if(l1<0 || l2<0){
          return 0;
       }
       else if(dp[l1][l2]!=-1){
       	  return dp[l1][l2];
       }
       else{
           if(s1.charAt(l1)==s2.charAt(l2)){
              return 1+getlong(s1,s2,l1-1,l2-1);
           }
           else{
              return Math.max(getlong(s1,s2,l1-1,l2),getlong(s1,s2,l1,l2-1));
           }
       }
   }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String s1=in.next();
	    String s2=in.next();
	    int l1=s1.length();
	    int l2=s2.length();
	    dp=new int[l1+1][l2+1];
	    for(int i=0;i<=l1;i++){
	    	for(int j=0;j<=l2;j++){
	    		dp[i][j]=-1;
	    	}
	    }
	    System.out.println(getlong(s1,s2,l1-1,l2-1));
	}
}