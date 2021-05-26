import java.util.*;
import java.lang.*;
class deck{
    static int noofways(int d,int c,int tr,int n,int sum){
           if(sum==tr && d==n){
           	   return 1;
           }
           else if(n==d){
              return 0;
           }
           else{
           	   int nsm=0;
           	   for(int i=1;i<=c;i++){
                     nsm+=noofways(d,c,tr,n+1,sum+i);
           	   }
           	   return nsm;
           }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int d=in.nextInt();
	   int c=in.nextInt();
	   int tr=in.nextInt();
	   System.out.println(noofways(d,c,tr,0,0));
	}
}