import java.util.*;
class isomorphic{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        Map<Character,Character> mp=new HashMap<Character,Character>();
        Set<Character> set=new HashSet<Character>();
        if(s1.length()!=s2.length()){
            System.out.println("false");
            System.exit(1);
        }
        else{
            int flag=0;
            for(int i=0;i<s1.length();i++){
                if(mp.getOrDefault(s1.charAt(i),'*')=='*'){
                    mp.put(s1.charAt(i),s2.charAt(i));
                }
                else{
                    if(mp.get(s1.charAt(i))!=s2.charAt(i)){
                        flag=1;
                        break;
                    }
                }
                set.add(s2.charAt(i));
            }
            if(flag==0 && set.size()==mp.size()){
                System.out.println("true");
                
            }
            else{
                System.out.println("false");
            }
            }
    }
}