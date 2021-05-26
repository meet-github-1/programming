import java.util.*;
import java.lang.*;
class pattern{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	   String s=in.next();
	   int n=in.nextInt();
	   String s1=s;
	   String prev="";
	   n--;
	   while(n-->0){
               prev=s1;
               //System.out.println(prev);
               s1="";
               char c1=prev.charAt(0);
               int count=1;
               for(int i=1;i<prev.length();i++){
               	  if(prev.charAt(i)!=c1){
               	  	    s1=s1+Integer.toString(count)+c1;
               	  	    //System.out.println(s1+" "+count);
               	  	    c1=prev.charAt(i);
               	  	    count=1;
               	  }
               	  else{
               	  	count++;
               	  }
               	}
               	  s1=s1+Integer.toString(count);
               	  s1=s1+c1;

	   }
	   System.out.println(s1);
	}
}