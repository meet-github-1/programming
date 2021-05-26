import java.util.*;
import java.lang.*;
class decks{
	static int count=0;
	static void recur(int d,int c,int tr,int nd,int sum){
		   if(nd==d){
		   	    if(sum==tr){
		   	    	//System.out.println(sum);
		   	    	count++;
		   	    }
		   	    return;
		   }
		   else{
               for(int i=1;i<=c;i++){
                     recur(d,c,tr,nd+1,sum+i);
               }
               return;
		   }
	}
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int d=in.nextInt();
	   int c=in.nextInt();
	   int tr=in.nextInt();
	   recur(d,c,tr,0,0);
	   System.out.println(count);
	}
}