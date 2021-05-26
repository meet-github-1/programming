import java.util.*;
import java.lang.*;
class lpalindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        boolean dp[][]=new boolean[len][len];
        int st=0;
        for(int i=0;i<len;i++){
            dp[i][i]=true;
            st=i;
        }
        int max=1;
        for(int i=0;i<len-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                max=2;
                st=i;
            }
        }
        for(int i=3;i<=len;i++){
            for(int j=0;j<=len-i;j++){
                if(s.charAt(j)==s.charAt(j+i-1) && dp[j+1][j+i-2]){
                    dp[j][i+j-1]=true;
                    max=Math.max(max,i);
                    st=j;
                }   
            }
        }
        /*for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println(s.substring(st,st+max));
    }
}