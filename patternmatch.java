import java.util.*;

class patternmatch{
    static int dp[][];
    static boolean ifmatch(String word,String pattern,int i,int j,int l1,int l2){
        if(i==l1 && j==l2){
            return true;
        }
        else if(i==l1){
            if(pattern.charAt(j)=='%'){
                return ifmatch(word,pattern,i,j+1,l1,l2);
            }
            return false;
        }
        else if(j==l2){
            return false;
        }
        else if(dp[i][j]!=0){
            return dp[i][j]==1?true:false;
        }
        else if(pattern.charAt(j)=='%'){
            boolean var=(ifmatch(word,pattern,i+1,j,l1,l2)||ifmatch(word,pattern,i,j+1,l1,l2));
            dp[i][j]=var?1:-1;
            return var;
        }
        else if(pattern.charAt(j)=='_' || word.charAt(i)==pattern.charAt(j)){
            boolean var=ifmatch(word,pattern,i+1,j+1,l1,l2);
            dp[i][j]=var?1:-1;
            return var;
        }
        else{
            return false;
        }
        
    }
    public boolean isMatch(String word, String pattern) {
        // write your code here.
        int s=word.length();
        int p=pattern.length();
        dp=new int[s][p];
        return(ifmatch(word,pattern,0,0,s,p));
        
        
    }
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String s1=in.next();
       String s2=in.next();
       System.out.println(isMatch(s1,s2));
    }
}