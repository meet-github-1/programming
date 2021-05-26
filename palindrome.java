import java.util.*;
import java.lang.*;
class palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int count1=0;
        int mx=Integer.MIN_VALUE;
        for(Map.Entry e:mp.entrySet()){
            if((int)e.getValue()%2==0){
                count1+=(int)e.getValue();
            }
            if((int)e.getValue()%2!=0 && (int)e.getValue()>mx){
                mx=(int)e.getValue();
            }
        }
        count1+=mx;
        System.out.println(count1);
        
    }
}