import java.util.*;
import java.lang.*;
class vencoding{
	public static void main(String[] args){
	 Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 String s=in.next();
	 int len=s.length();
	 StringBuilder arr[]=new StringBuilder[n];
	 int i=0;
	 loop1:
	 while(true){
	     for(int j=0;j<n;j++){
	         if(i>=len){
	             break loop1;
	         }
	         if(arr[j]==null){
	             arr[j]=new StringBuilder("");
	         }
	         arr[j].append(s.charAt(i));
	         //System.out.println(j+" "+s.charAt(i));
	         i++;
	         
	     }
	     for(int j=n-2;j>0;j--){
	         if(i>=len){
	             break loop1;
	         }
	          if(arr[j]==null){
	             arr[j]=new StringBuilder("");
	         }
	         arr[j].append(s.charAt(i));
	         //System.out.println(j+" "+s.charAt(i));
	         i++;
	     }
	     
	 }
	 String res="";
	 for(i=0;i<n;i++){
	     res=res+arr[i].toString();
	     
	 }
	 System.out.println(res);
	 
	}
}