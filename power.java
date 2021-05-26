import java.util.*;
import java.lang.*;
class power{
    static float pow(float m,float n){
        //System.out.println(m+" "+n);
        float pw;
        if((int)n==0) return 1;
        pw=pow(m,n/2);
        if((int)n%2==0) return pw*pw;
        if((int)n%2!=0 && (int)n<0) return (pw*pw)/m;
        else return m*pw*pw;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        float res=pow(m,n);
        System.out.println(res);
    }
}