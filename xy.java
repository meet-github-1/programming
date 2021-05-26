import java.util.*;
import java.lang.*;
class xy{
    static char num[];
    static int count=0;
    static int len;
    static boolean check(String s,int n){
        if(Integer.parseInt(s)>n || s.charAt(0)=='0'){
            return false;
        }
        int ln=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ln;i++){
            if(s.charAt(i)=='6'){
                sb.append('9');
            }
            else if(s.charAt(i)=='9'){
                sb.append('6');
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        return !sb.toString().equals(s);
    } 
    static void generate(int n,int ind,String s){
        if(ind==len){
            return;
        }
        else{
            for(int i=0;i<5;i++){
                count=count+(check(s+num[i],n)?1:0);
                //System.out.println(s+num[i]+" "+count);
                generate(n,ind+1,s+num[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        num=new char[]{'0','1','6','8','9'};
        len=Integer.toString(n).length();
        generate(n,0,"");
        System.out.println(count);
    }
}