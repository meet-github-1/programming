import java.util.*;
import java.lang.*;
class vertically{
    static  String getvalidstring(String r){
        int lastpos=0;
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)!=' '){
                lastpos=i+1;
            }
        }
        String res=r.substring(0,lastpos);
        return res;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int mx=-9999;
        for(String s:arr){
            int len=s.length();
            if(len>mx){
                mx=len;
            }
        }
        String res[]=new String[mx];
        String r;
        for(int i=0;i<mx;i++){
            r="";
            for(String s:arr){
                if(i>=s.length()){
                    r=r+" ";
                }
                else{
                r=r+s.charAt(i);
            }
                
            }
            r=getvalidstring(r);
            if(!r.equals("")) res[i]=r;
            
        }
        for(String s:res){
            System.out.print(s+",");
        }
    }
}