import java.util.*;
import java.lang.*;
class square{
    static String getsquare(String s){
        int sum=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            sum+=Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),2);
        }
        return Integer.toString(sum);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=Integer.toString(n);
        while(s.length()!=1){
            s=getsquare(s);
        }
        System.out.println(s.equals("1"));
    }
}