import java.util.*;
import java.lang.*;
import java.io.*;

class nutsandbolts{
   static void nutsmatchbolts(String s1,String s2,int len){
   	   char out[]={'!','#','$','%','&','*','@','^','~'};
   	   Map<Character,Integer> mp1=new HashMap<Character,Integer>();
   	    Map<Character,Integer> mp2=new HashMap<Character,Integer>();
   	   for(int i=0;i<(len+len-1);i=i+2){
                 mp1.put(s1.charAt(i),mp1.getOrDefault(s1.charAt(i),0)+1);
                  mp2.put(s2.charAt(i),mp2.getOrDefault(s2.charAt(i),0)+1);

   	   }
   	   String x="";
   	   String y="";
   	   for(char c:out){
   	   	  if(mp1.getOrDefault(c,-1)==mp2.getOrDefault(c,0)){
   	   	  	int op=mp1.get(c);
   	   	  	while(op-->0){
   	   	  		//System.out.print(c);
   	   	  		x=x+c+" ";
   	   	  		y=y+c+" ";
   	   	  	}
   	   	  }
   	   }
   	   System.out.println(x);
   	   System.out.println(y);
   	   //System.out.println();
   }
	public static void main(String[] args)throws IOException{
	 //Scanner in=new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(bf.readLine());
	 while(n-->0){
	    int x=Integer.parseInt(bf.readLine());
	    String s1=bf.readLine();
	    //System.out.println("pop1"+" "+s1);
	    String s2=bf.readLine();
	    //System.out.println("pop2"+" "+s2);
	    nutsmatchbolts(s1,s2,x);
	 }
	}
}