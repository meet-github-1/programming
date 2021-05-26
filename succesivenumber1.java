import java.util.*;
import java.lang.*;
class succesivenumber1{
    static List<Integer> l;
    static void getsuccesivenumbers(int st,int ed){
    	int n1;
           for(int d=1;d<=9;d++){
             int nxt=d,n=nxt;
             while(n<=ed && nxt<10){
                if(n>=st){
                l.add(n);
                }
                n1=n*10+ ++nxt;
                if(n1>n){
                  n=n1;
                }
                else{
                	break;
                }
             }
           }
           Collections.sort(l);
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	l=new ArrayList<Integer>();
	getsuccesivenumbers(in.nextInt(),in.nextInt());
	System.out.println(l);
	
	}
}