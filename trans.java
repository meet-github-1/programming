import java.util.*;
import java.lang.*;
class trans{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        List<ArrayList<Character>> l=new ArrayList<ArrayList<Character>>();
        String s;
        for(int i=0;i<r;i++){
            s=in.next();
            l.add(new ArrayList<Character>());
            for(int j=0;j<s.length();j++){
                l.get(i).add(s.charAt(j));
            }
        }
        boolean flag=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<l.get(i).size();j++){
                if(l.get(j).size()<=i || l.get(i).get(j)!=l.get(j).get(i)){
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}