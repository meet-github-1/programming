import java.util.*;
import java.lang.*;
class expss{
    static String[] crossmul(String s){
        TreeSet<String> l=new TreeSet<String>();
        if(s.length()==0){
            return new String[]{""};
        }
        else if(s.length()==1){
            return new String[]{s};
        }
        else{
            if(s.charAt(0)=='['){
                int i=1;
                while(s.charAt(i)!=']'){
                    i++;
                }
                String sarr[]=s.substring(1,i).split(",");
                String sarr1[]=crossmul(s.substring(i+1));
                for(String sr:sarr){
                    for(String sr1:sarr1){
                        l.add(sr+sr1);
                    }
                }
            }
            else{
                String sarr1[]=crossmul(s.substring(1));
                for(String sr1:sarr1){
                    l.add(s.charAt(0)+sr1);
                }
            }
            return l.toArray(new String[0]);
        }
        
    }
   public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String s=in.next();
       System.out.println(Arrays.toString(crossmul(s)));
   }
}