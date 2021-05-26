import java.util.*;
import java.lang.*;
class basava{
    static List<String> l;
    static boolean check(String s,int d){
        int len=s.length();
        boolean flag=true;
        for(int i=0;i<len-1;i++){
            if(Math.abs(Integer.parseInt(String.valueOf(s.charAt(i+1)))-Integer.parseInt(String.valueOf(s.charAt(i))))!=d){
                flag=false;
                break;
            }
        }
        return flag;
    }
    static void getnumbers(int n,int d,String s){
        if(n==0){
            if(check(s,d)){
             l.add(s);   
            }
         return;
        }
        else{
            for(int i=0;i<=9;i++){
                if(!check(s,d)){
                    return;
                }
                else{
                getnumbers(n-1,d,s+i);
                }
            }
            return;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        l=new ArrayList<String>();
        getnumbers(n,d,"");
        List<String> l1=new ArrayList<String>();
        for(String s:l){
            if(s.startsWith("0")){
                continue;
            }
            l1.add(s);
        }
        System.out.println(l1);
    }
}