import java.lang.*;
import java.util.*;
class precedence{
    static int MIN=0;
    static boolean ifprecedence(String s1,String s2){
    	int len1=s1.length();
    	int len2=s2.length();
       if(len2-1==len1){
       	     List<Character> l=new ArrayList<Character>();
       	     for(int i=0;i<len2;i++){
       	     	l.add(s2.charAt(i));
       	     }
       	     for(int i=0;i<len1;i++){
       	     	Character z=s1.charAt(i);
       	     	l.remove(z);
       	     }
       	     if(l.size()==1){
       	     	return true;
       	     }
       	     return false;
           }
           return false;

    }
    static int makelarge(String arr[],String prev,int ind,int len){
         if(ind==len){
            return 0;
         }
         else{
         	int max=MIN;
         	for(int i=0;i<len;i++){
         		if(ind==0){
         			max=Math.max(max,1+makelarge(arr,arr[i],ind+1,len));
         		}
         		else{
         		 if(ifprecedence(prev,arr[i])){
         		     max=Math.max(max,1+makelarge(arr,arr[i],ind+1,len));
         		 }
         	   }
         	}
         	return max;
         }
    }
	public static void main(String [] args){
	    Scanner in =new Scanner(System.in);
	    String arr[]=in.nextLine().split(" ");
	    int len=arr.length;
	    System.out.println(makelarge(arr,"",0,len));
	}
}