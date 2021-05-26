import java.util.*;
import java.lang.*;
class stringisomorphic{
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     String s1=in.next();
	     String s2=in.next();
	     int len1=s1.length();
         int len2=s2.length();
	     Map<Character,Character> mp=new HashMap<Character,Character>();
	     Set<Character> st=new HashSet<Character>();
	      boolean flag=false;
	      if(len1!=len2){
	           System.out.println("not isomorphic1");
	      }
	      else{
	         char c1,c2;
	         for(int i=0;i<len1;i++){
	           c1=s1.charAt(i);
	           c2=s2.charAt(i);
	           if(mp.getOrDefault(c1,'#')=='#'){
	                mp.put(c1,c2);
	           }
	           else{
	           	//System.out.println(mp.get(c1)+" "+c2);
                   if(!(mp.get(c1)==c2)){
                       flag=true;
                       break;
                   }
                   }
                st.add(c2);
	         }
	      }
	        if(flag){
	           System.out.println("not isomorphic2");
	        }
	        else{
	           if(mp.size()!=st.size()){
	               System.out.println("not isomorphic3");
	           }
	           else{
	           System.out.println("isomorphic");
	           }
	        }
	     	}
}