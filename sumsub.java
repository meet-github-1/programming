import java.util.*;
import java.lang.*;
class sumsub{
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  String s=in.next();
	  int len=s.length();
	  int arr[]=new int[len];
	  int sum=0;
	  for(int i=0;i<len;i++){
	    arr[i]=((i+1)*Integer.parseInt(String.valueOf(s.charAt(i))))+(10*((i==0)?0:arr[i-1]));
	    //System.out.println(arr[i]);
	    sum+=arr[i];
	  }
	 System.out.println(sum);
	}
}