import java.util.*;
import java.lang.*;
import java.io.*;
class stringplaying{
	public static void main(String[] args)throws IOException{
	  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	  String s1=bf.readLine();
	  String s2[]=bf.readLine().split(" ");
	  int len1=s1.length();
	  int len2=s2.length;
	  if(len1!=len2){
	      System.out.println("false");
	  }
	  else{
	      char c;
	      String ex;
	      int flag=0;
	      Map<Character,String> mp=new HashMap<Character,String>();
	      Set<String> st=new HashSet<String>();
	      for(int i=0;i<len1;i++){
	          c=s1.charAt(i);
	          ex=s2[i];
	          if(mp.getOrDefault(c,"null").equals("null")){
	              mp.put(c,ex);
	          }
	          else{
	              if(!mp.get(c).equals(ex)){
	                  flag=1;
	                  break;
	              }
	          }
	          st.add(ex);
	          
	          
	      }
	      if(flag==1){
	          System.out.println("false");
	      }
	      else{
	          if(st.size()!=mp.size()){
	              System.out.println("false");
	          }
	          else{
	              System.out.println("true");
	          }
	      }
	  }
	  
	  
	}
}