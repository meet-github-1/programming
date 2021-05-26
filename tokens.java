import java.util.*;
import java.lang.*;
class token{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        Set<Integer> st=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int num=in.nextInt();
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int i:mp.keySet()){
            st.add(mp.get(i));
        }
        System.out.println(st.size()==mp.size());
    }
}