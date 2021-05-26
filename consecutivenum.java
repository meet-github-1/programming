import java.util.*;
import java.lang.*;
class consecutivenum{
    static List<Integer> consecnum(int st,int ed){
        List<Integer> res=new ArrayList<Integer>();
        for(int i=1;i<9;i++){
            int nxt=i;
            int n=nxt;
            while(n<=ed && nxt<10){
                if(n>=st){
                    res.add(n);
                }
                int n1=n*10+ ++nxt;
                if(n1>n){
                    n=n1;
                }
                else{
                    break;
                }
            }
            
        }
        Collections.sort(res);
        return res;
    }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n1=in.nextInt();
	  int n2=in.nextInt();
	  System.out.println(consecnum(n1,n2));
	}
}