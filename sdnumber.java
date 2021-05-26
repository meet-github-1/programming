import java.util.*;
import java.lang.*;
class sdnumber{
    static boolean sd(String s,int num){
        int len=s.length();
        for(int i=0;i<len;i++){
            int dg=Integer.parseInt(String.valueOf(s.charAt(i)));
            if(dg==0) return false;
            if(num%dg!=0) return false;
        }
        return true;
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int st=in.nextInt();
	int ed=in.nextInt();
	String s;
	for(int i=st;i<=ed;i++){
	    s=i+"";
	    if(sd(s,i)){
	        System.out.print(i+" ");
	    }
	    
	}
	}
}