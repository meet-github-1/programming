import java.util.*;
import java.lang.*;
import java.io.*;
class phone{
    static PriorityQueue<String> pq;
    static Map<Character,String> mp;
    static void getstrings(String q,String s,int ln,int len){
        if(ln==len){
            pq.add(q);
            return ;
        }
        else{
            String res=mp.get(s.charAt(ln));
            for(int i=0;i<res.length();i++){
                getstrings(q+res.charAt(i),s,ln+1,len);
                
            }
            return ;
        }
        
    }
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     String n=in.next();
	     int len=n.length();
	     pq=new PriorityQueue<String>();
	     mp=new HashMap<Character,String>();
	     mp.put('2',"abc");mp.put('3',"def");mp.put('4',"ghi");mp.put('5',"jkl");mp.put('6',"mno");mp.put('7',"pqrs");
	     mp.put('8',"tuv");mp.put('9',"wxyz");
	     getstrings("",n,0,len);
	     System.out.println(pq);
	     
	     
	}
}