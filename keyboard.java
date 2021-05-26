import java.util.*;
import java.lang.*;
class keyboard{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String sarr[]={"qwertyuiop","asdfghjkl","zxcvbnm"};
        Map<Character,int[][]> mp=new HashMap<Character,int[][]>();
        int k=0;
        for(String s:sarr){
            int len=s.length();
            for(int i=0;i<len;i++){
                char c=s.charAt(i);
                if(mp.getOrDefault(c,null)==null){
                    mp.put(c,new int[][]{{k,i}});
                }
            }
            k++;
        }
        String arr[]=in.nextLine().split(" ");
        List<String> l=new ArrayList<String>();
        for(String s:arr){
            int len=s.length();
             int rowcolarr[][]=mp.get(s.charAt(0));
             int row=rowcolarr[0][0];
             boolean flag=true;
             for(int i=1;i<len;i++){
                 int rowarr[][]=mp.get(s.charAt(i));
                 int row1=rowarr[0][0];
                 if(row1!=row){
                     flag=false;
                 }
             }
             if(flag){
                 l.add(s);
             }
        }
        System.out.println(l);
    }
}