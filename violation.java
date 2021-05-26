import java.util.*;
import java.lang.*;
class  violation{
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     String s1=in.next();
	     String s2=in.next();
	     int count=0;
	     Map<Character,Integer> mp=new HashMap<Character,Integer>();
	     for(int i=0;i<s1.length();i++){
	     	mp.put(s1.charAt(i),1);
	     }
	     for(int i=0;i<s2.length();i++){
	     	if(mp.getOrDefault(s2.charAt(i),0)!=0) count++;
	     }
	     System.out.println(count);


	}
}