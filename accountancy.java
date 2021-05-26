import java.util.*;
import java.lang.*;
class accountancy{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        TreeSet<Integer> s=new TreeSet<Integer>(Collections.reverseOrder());
        while(n-->0){
            s.add(in.nextInt());
        }
        int x=0;
        int y=0;
        while(x<3){
            y=s.pollFirst();
            //System.out.println(y);
            x++;
        }
        System.out.println(y);
    }
}