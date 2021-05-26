import java.util.*;
import java.lang.*;
class shortestway{
   static boolean issubsequence(String sub,String s){
         int len=sub.length(); 
         if(len==1){
         	 return(s.indexOf(sub.charAt(0))!=-1);
         }
         int flag=0;
         if(s.indexOf(sub.charAt(0))==-1){
         	 flag=1;
         }
         if(flag==0){
         for(int i=1;i<len;i++){
         	 if(s.indexOf(sub.charAt(i))==-1){
         	 	flag=1;
         	 	break;
         	 }
             if((s.indexOf(sub.charAt(i))-s.indexOf(sub.charAt(i-1)))<=0){
                flag=1;
                break;
             }
         }
     }
         return(flag==0);
   }
   static int minimumsub(String s,String tr,int len){
       if(len==0){
          return 0;
       }
       else{
          int min =99999;
          int sum=0;
          for(int i=1;i<=len;i++){
               String sub=tr.substring(0,i);
               if(issubsequence(sub,s)){
               	 //System.out.println(sub);
                 sum=1+minimumsub(s,tr.substring(i,len),len-i);
                 min=Math.min(min,sum);
               }
          }
          return min;
       }
   }
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     String s=in.next();
	     String tr=in.next();
	     int len=tr.length();
	     //System.out.println(tr.substring(0,len));
       dp=new int[len];
	     System.out.println(minimumsub(s,tr,len));
	}
}