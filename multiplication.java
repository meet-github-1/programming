import java.util.*;
import java.lang.*;
class multiplication{
    static StringBuilder multiply(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        int ar[]=new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int mul=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                int pos1=i+j;int pos2=i+j+1;
                mul=mul+ar[pos2];
                ar[pos1]=ar[pos1]+mul/10;
                ar[pos2]=mul%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:ar){
            if(!(sb.length()==0 && i==0)){
              sb.append(i);
            }
        }
        return sb;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String s=multiply(s1,s2).toString();
        System.out.println(s.length()==0?"0":s);
    }
}