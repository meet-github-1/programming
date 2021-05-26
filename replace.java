import java.util.*;
import java.lang.*;
class replace{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        char c='0';
        int count1=0;
        for(int i=0;i<len;i++){
            if(c!=s.charAt(i)){
                count1++;
            }
            c=(c=='0')?'1':'0';
        }
        int count2=0;
        c='1';
        for(int i=0;i<len;i++){
            if(c!=s.charAt(i)){
                count2++;
            }
            c=(c=='0')?'1':'0';
        }
        System.out.println(Math.min(count1,count2));
        
    }
}