import java.util.*;
import java.lang.*;
class lst{
	String s;
	int len;
	lst(String s,int len){
		this.s=s;
		this.len=len;
	}
	@Override
	public String toString(){
		return s+" "+len;
	}
}
class sortlist implements Comparator<lst>{
	public int compare(lst a,lst b){
		if(a.len==b.len){
			return a.s.compareTo(b.s);
		}
		return a.len-b.len;
	}
}
class pred {
	static boolean ifprecedence(String s1,String s2){
		int len1=s1.length();
    	int len2=s2.length();
       if(len2-1==len1){
       	     List<Character> l=new ArrayList<Character>();
       	     for(int i=0;i<len2;i++){
       	     	l.add(s2.charAt(i));
       	     }
       	     for(int i=0;i<len1;i++){
       	     	Character z=s1.charAt(i);
       	     	l.remove(z);
       	     }
       	     if(l.size()==1){
       	     	return true;
       	     }
       	     return false;
           }
           return false;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    List<lst> l=new ArrayList<lst>();
	    lst li;
	    String s;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	    	s=in.next();
	       li=new lst(s,s.length());
	       l.add(li);
	       arr[i]=1;
	    }
	    System.out.println(l);
	    Collections.sort(l,new sortlist());
	    System.out.println(l);
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	    	int prev=arr[i];
	    	for(int j=i;j>=0;j--){
	    		if(ifprecedence(l.get(j).s,l.get(i).s)){
	    			arr[i]=Math.max(arr[i],prev+arr[j]);
	    			//System.out.println(l.get(i).s+" "+l.get(j).s+" "+arr[i]+" "+arr[j]);
	    		}
	    	}
	    	max=Math.max(max,arr[i]);
	    }
	    System.out.println("maximum"+" "+max);
	}
}