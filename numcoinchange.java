import java.util.*;
import java.lang.*;
class numcoinchange{
    static int numofways(int coin[],int n,int m){
    	//System.out.println(n);
        if(n==0){
           return 1;
        }
        else if(n<0){
        	return 0;
        }
        else if(m<0 && n>=1){
        	return 0;
        }
        else{
          return(numofways(coin,n,m-1) + numofways(coin,n-coin[m],m));
          }
    }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int m=in.nextInt();
	  int coin[]=new int[m];
	  for(int i=0;i<m;i++){
	    coin[i]=in.nextInt();
	  }
	  System.out.println(numofways(coin,n,m-1));
	}
}