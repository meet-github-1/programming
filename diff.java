import java.util.*;
import java.lang.*;
class diff{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int res=Integer.bitCount(n1^n2);
        System.out.println(res);
    }
}