import java.util.*;
import java.lang.*;
class dicform{
    static  Map<String,Integer> mp;
    static Map<String,Boolean> mp1;
    static List<String> l;
    static boolean ispossible(String inp,int len){
        if(mp.getOrDefault(inp,0)==1){
        l.add(inp);
           return true;
        }
        else if(mp1.get(inp)!=null){
        	return mp1.get(inp);
        }
        else{
           for(int i=0;i<len;i++){
           	//System.out.println(inp+" "+0+" "+i);
             if(mp.getOrDefault(inp.substring(0,i),0)==1){
                if(ispossible(inp.substring(i,len),len-(i))){
                	l.add(inp.substring(0,i));
                	mp1.put(inp.substring(i,len),true);
                	return true;
                }
                else{
                	l.remove(l.size()-1);
                }

             }
             mp1.put(inp,false);
           }
           return false;
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    mp1=new HashMap<String,Boolean>();
        l=new ArrayList<String>();
	   mp=new HashMap<String,Integer>(){{put("i",1);
	   put("like",1);
	   put("sam",1);
	   put("sung",1);
	   put("samsung",1);
	   put("mobile",1);
	   put("ice",1);
	   put("cream",1);
	   put("and",1);
	   put("icecream",1);
	   put("man",1);
	   put("go",1);
	   put("mango",1);}};
	    String inp=in.next();
	    int len=inp.length();
	    System.out.println(ispossible(inp,len));
	    for(int i=l.size()-1;i>=0;i--){
	    	System.out.print(l.get(i)+" ");
	    }
	}
}