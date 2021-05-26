import java.util.*;
import java.lang.*;
class express{
    static Map<String,ArrayList<String>> mp;
    static boolean first=false;
    static String firstarr[];
    static String firststr;
    static String prevarr[];
    static String prevstr;
    static boolean prev=false;
    static List<String> l;
    static void dfs(String nxt,String s){
        if(mp.get(nxt).size()==0){
            l.add(s);
            return ;
        }
        else{
            for(String sr:mp.get(nxt)){
                dfs(sr,s+sr);
            }
            return ;
        }
    }
    static void arrayarray(String arr[],String carr[]){
        for(String sr:arr){
            for(String sr1:carr){
                mp.get(sr).add(sr1);
            }
        }
    }
    static void arraystr(String arr[],String s){
        //System.out.println(Arrays.toString(arr)+" "+s);
        for(String sr:arr){
            mp.get(sr).add(s);
        }
    }
    static void strarray(String s,String arr[]){
        for(String sr:arr){
            mp.get(s).add(sr);
        }
    }
    static void addinmap(String s){
        if(s.indexOf(',')==-1){
            if(!first){
                firststr=s;
                prevstr=s;
                mp.put(s,new ArrayList<String>());
                first=true;
                return;
            }
            else{
                if(prevarr==null){
                    mp.put(s,new ArrayList<String>());
                    mp.get(prevstr).add(s);
                    prevstr=s;
                }
                else{
                    mp.put(s,new ArrayList<String>());
                    prevstr=s;
                    arraystr(prevarr,s);
                    prevarr=null;
                }
                return;
            }
            
        }
        else{
            String arr[]=s.split(",");
            if(!first){
                firstarr=arr;
                prevarr=arr;
                for(String sr:arr){
                    mp.put(sr,new ArrayList<String>());
                }
                first=true;
                return;
            }
            else{
                for(String sr:arr){
                    mp.put(sr,new ArrayList<String>());
                }
                if(prevarr==null){
                    strarray(prevstr,arr);
                    prevarr=arr;
                    prevstr=null;
                }
                else{
                    arrayarray(prevarr,arr);
                    prevarr=arr;
                }
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        boolean open=false;
        String s1="";
        int openind=0;
        mp=new HashMap<String,ArrayList<String>>();
        l=new ArrayList<String>();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='['){
                open=true;
                if(!s1.equals("")){
                    addinmap(s1);
                    s1="";
                }
                openind=i;
            }
            else if(c==']'){
                open=false;
                String sub=s.substring(openind+1,i);
                addinmap(sub);
            }
            else if(c>='a' && c<='z' && !open){
                s1=s1+c;
            }
            
        }
        if(!s1.equals("")){
            addinmap(s1);
        }
        if(firststr==null){
            for(String sr:firstarr){
                dfs(sr,""+sr);
            }
        }
        else{
            dfs(firststr,""+firststr);
        }
        System.out.println(l);
    }
}