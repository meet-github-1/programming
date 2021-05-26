import java.util.*;
import java.lang.*;
class stringdivide{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int c=0;
        int count=-1;
        int len=s.length();
        char cr;
        for(int i=0;i<len;i++){
            cr=s.charAt(i);
            if(c==0){
                count++;
            }
            if(cr=='A'){
                c++;
            }
            else{
                c--;
            }
            
        }
        if(c==0){
            count++;
        }
        System.out.println(count);
    }
}