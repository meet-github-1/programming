import java.util.*;
import java.lang.*;
class maximumnum{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String s=in.next();
	StringBuilder sb=new StringBuilder(s);
	int len=s.length();
	for(int i=0;i<len;i++){
	    char c=s.charAt(i);
	    if(c=='2'){
	        sb.replace(i,i+1,"5");
	        break;
	    }
	}
	    
	System.out.println(Integer.parseInt(sb.toString()));
	}
}