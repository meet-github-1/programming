import java.util.*;
import static java.lang.System.out;
class form{
    static Set<String> l1=new HashSet<String>();
    static String swap(String s,int i,int j){
        char arr[]=s.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
    static void permute(String s,int l,int h){
        if(l==h){
            l1.add(s);
        }
        else{
            for(int i=l;i<=h;i++){
                s=swap(s,l,i);
                permute(s,l+1,h);
                s=swap(s,l,i);
            }
        }
    }
    static boolean pro(String f,Map<Integer,List<String>> map,int len){
        Set<String> sp=new HashSet<String>();
        for(int i=0;i<len;i++){
            if(f.charAt(i)=='1'){
                for(String pr:map.get(i+1)){
                   sp.add(pr);
                }
            }
        }
        if(sp.size()!=len){
            return true;
        }
        return false;
    }
    static void print(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                out.print(i+1+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s[]=in.nextLine().split(" ");
        int len=s.length;
        Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
        for(int i=1;i<=len;i++){
            map.put(i,new ArrayList<String>());
            String p[]=in.nextLine().split(" ");
            for(String pr:p){
            map.get(i).add(pr);
            }
        }
        if(pro("1".repeat(len),map,len)){
            out.println("-1");
        }
        else{
            for(int i=len-1;i>=1;i--){
                permute("0".repeat(i)+"1".repeat(len-i),0,len-1);
                for(String sf:l1){
                    if(!pro(sf,map,len)){
                        print(sf);
                        System.exit(1);

                    }
                }
                l1.clear();

            }
            print("1".repeat(len));
        }
    }
}