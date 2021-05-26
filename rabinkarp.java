import java.util.*;
class rabinkarp{
    static int arr1[];
    static int gethash(String s,int st,int ed){
        int sum=0;
        for(int i=st;i<ed;i++){
            sum=sum+(int)s.charAt(i);
        }
        return sum;
    }
    static int update(int h2,String w2,int sub,int add){
        h2=h2+(int)w2.charAt(add);
        h2=h2-(int)w2.charAt(sub);
        return h2;
        
    }
    static boolean checkmatch(String w1,String w2,int st,int len,int arr2[]){
        int ind=0;
        int i=st;
        //System.out.println(i);
        while(ind<len){
            arr2[(int)w2.charAt(i)]=arr2[(int)w2.charAt(i)]+1;
            i++;
            ind++;
        }
        //System.out.println(mp1+" "+mp2);
        for(int j=0;j<128;j++){
            if(arr1[j]!=arr2[j]){
                return false;
            }
        }
        return true;
    }
    public boolean checkSubstring(String w1, String w2){
        int len1=w1.length();
        int len2=w2.length();
        if(len2<len1){
            return false;
        }
        int h1=gethash(w1,0,len1);
        int h2=gethash(w2,0,len1);
        //System.out.println(h1+" "+h2);
        arr1=new int[128];
        for(int i=0;i<len1;i++){
            arr1[(int)w1.charAt(i)]=arr1[(int)w1.charAt(i)]+1;
        }
        int arr2[]=new int[128];
        if(h1==h2){
            if(checkmatch(w1,w2,0,len1,arr2)){
                return true;
            }
        }
        for(int i=1;i<=len2-len1;i++){
            h2=update(h2,w2,i-1,i+len1-1);
            //System.out.println(i+" "+h2);
            if(h1==h2){
                if(checkmatch(w1,w2,i,len1,arr2)){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        rabinkarp rp=new rabinkarp();
        System.out.println(rp.checkSubstring(in.next(),in.next()));
    }
}