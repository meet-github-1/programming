import java.util.*;
import java.lang.*;
class deletechars{
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   String s1=in.next();
	   int l=s1.length();
	   int c1=0;
	   int c2=0;
	   for(int i=0;i<l;i++){
	   	if(s1.charAt(i)=='a'){
	   		c1++;
	   	}
	   	else{
	   		c2++;
	   	}
	   	c1=Math.min(c1,c2);
	   }
	   System.out.println(c1);
	}
}