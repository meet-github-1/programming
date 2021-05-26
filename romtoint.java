import java.util.*;
class romtoint{
    static int romantointeger(String s){
        Map<Character,Integer> mp1=new HashMap<Character,Integer>();
        mp1.put('I',1);mp1.put('V',5);mp1.put('X',10);mp1.put('L',50);mp1.put('C',100);mp1.put('D',500);mp1.put('M',1000);
        Map<String,Integer> mp2=new HashMap<String,Integer>();
        mp2.put("IV",4);mp2.put("IX",9);mp2.put("XL",40);mp2.put("XC",90);mp2.put("CD",400);mp2.put("CM",900);
        int len=s.length();
        int i=0;
        int res=0;
        while(i<len){
        	if(i+1<len){
        		String sub=s.substring(i,i+2);
        		if(mp2.getOrDefault(sub,-1)>0){
                     res+=mp2.get(sub);
                     i=i+2;
        		}
        		else{
        			char c=s.charAt(i);
        			res+=mp1.get(c);
        			i++;
        		}
        	}
        	else{
        		char c=s.charAt(i);
        		res+=mp1.get(c);
        		i++;

        	}
        }
        return res;

    }
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String rom=in.next();
        System.out.println(romantointeger(rom));
	}
}