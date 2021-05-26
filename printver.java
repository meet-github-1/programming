import java.util.*;
import java.lang.*;
class printver{
     static List<String> printword(int max,String arr[]){
           int len;
           String s1="";
           List<String> l=new ArrayList<String>();
           for(int i=0;i<max;i++){
           	   System.out.println(i);
               s1="";
               for(String s:arr){
                 len=s.length();
                 System.out.println(len);
                 if(len-1>=i){
                     s1+=s.charAt(i);
                 }
               }
               l.add(s1);
           }
           //System.out.println(l);
           int ls=0;
           List<String> l1=new ArrayList<String>();
           for(String s11:l){
                len=s11.length();
                ls=0;
                for(int i=len-1;i>=0;i--){
                     if(s11.charAt(i)!=' '){
                         ls=i;
                         break;
                     }
                }
                l1.add(s11.substring(0,ls+1));
                
           }
           return l1;
     }
	 public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String arr[]=in.nextLine().split(" ");
	    int max=Integer.MIN_VALUE;
	    int len;
	    for(String s:arr){
	          len=s.length();
              if(len>max){
                   max=len;
              }
	    }
	    System.out.println(printword(max,arr));
	 }
}