import java.util.*;
import java.lang.*;
class shortform{
    static Set<String> st;
    static String decode(String s,int lent){
        int sum=0; 
        String dec="";
         for(int i=0;i<lent;i++){
             if(s.charAt(i)=='1'){
                sum++;
             }
             else{
             	if(sum==0){
             	 dec=dec+s.charAt(i);
             	}
             	else{
                dec=dec+Integer.toString(sum)+s.charAt(i);
                }
                sum=0;
             }
         }
         if(sum!=0){
           dec=dec+Integer.toString(sum);
         }
         return dec;
    }
    static void getshorts(String s,String dd,int len,int lent){
        if(len==lent){
          st.add(decode(dd,lent));
          return;
        }
        else{
           getshorts(s,dd+s.charAt(len),len+1,lent);
           getshorts(s,dd+'1',len+1,lent);
           return ;
        }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   String s=in.nextLine();
	   st=new TreeSet<String>();
	   int len=s.length();
	   getshorts(s,"",0,len);
	   System.out.println("decodes are"+" "+st);
	}
}