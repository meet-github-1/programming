import java.util.*;
import java.lang.*;
import java.io.*;
class decrypt{
	static List<String> li;
    static boolean isisomorphic(String sr,String tr){
        Map<Character,Character> mp=new HashMap<Character,Character>();
        int len1=sr.length();
        int len2=tr.length();
        Set<Character> st=new HashSet<Character>();
        if(len1!=len2){
           return false;
        }
        else{
           for(int i=0;i<len1;i++){
             if(mp.getOrDefault(sr.charAt(i),'#')=='#'){
                 mp.put(sr.charAt(i),tr.charAt(i));
             }
             else{
                if(mp.get(sr.charAt(i))!=tr.charAt(i)){
                     return false;
                }
             }
             st.add(tr.charAt(i));

           }
           if(mp.size()!=st.size()){
              return false;
           }
           return true;

        }
    }
    static boolean isomorphic(String sr,String tr){
             String arr1[]=sr.split(" ");
             String arr2[]=tr.split(" ");
             int len=arr1.length;
             String srr="";
             String trr="";
             for(int i=0;i<len;i++){
                srr=srr+arr1[i];
                trr=trr+arr2[i];
             }
             if(!isisomorphic(srr,trr)){
                   return false;
                }
             return true;
    }
    static void decr(String dr,String arr[],int ind,int n,int len,String l){
          if(len==0){
          	 //System.out.println(dr+" "+l);
             if(isomorphic(dr,l)){
             	li.add(l);
                System.out.println(l);
             }
             return ;
          }
          else if(ind==n){
             return ;
          }
          else{
             decr(dr,arr,ind+1,n,len-1,l+arr[ind]+" ");
             decr(dr,arr,ind+1,n,len,l);
          }
    }
	public static void main(String[] args) throws Exception{
	    Scanner in=new Scanner(System.in);
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    int n=in.nextInt();
	    String arr[]=new String[n*2];
	    for(int i=0;i<n;i++){
	       arr[i]=in.next();
	    }
	    for(int i=n;i<n*2;i++){
	    	arr[i]=arr[i-n];
	    }
	    String dr[]=bf.readLine().split(" ");
	    String d="";
	    int len=0;
	    for(String s:dr){
	        d=d+s+" ";
	        len++;
	    }
	    li=new ArrayList<String>();
	    String l="";
	    decr(d,arr,0,n*2,len,l);
	    if(li.isEmpty()){
	    	for(String s:dr){
	    		String rep="*".repeat(s.length());
	    		System.out.print(rep+" ");
	    	}
	    	System.out.println();
	    }
	}
}