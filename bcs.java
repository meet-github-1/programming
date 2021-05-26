import java.util.*;
import java.lang.*;
class bcs{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        List<String> l=new ArrayList<String>();
        l.add("0");
        l.add("1");
        int rang=(int)Math.pow(2,n);
        for(int i=2;i<rang;i=i<<1){
            for(int j=i-1;j>=0;j--){
                l.add(l.get(j));
            }
            for(int j=0;j<i;j++){
                l.set(j,"0"+l.get(j));
            }
            for(int j=i;j<2*i;j++){
                l.set(j,"1"+l.get(j));
            }
        }
        List<Integer> l1=new ArrayList<Integer>();
        for(String s:l){
            l1.add(Integer.parseInt(s,2));
        }
        System.out.println(l1);
    }
}