import java.util.*;
import java.lang.*;
class lcsprint{
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   String s1=in.next();
	   String s2=in.next();
	   char x[]=s1.toCharArray();
	   char y[]=s2.toCharArray();
	   int l1=x.length;
	   int l2=y.length;
	   int l[][]=new int[l1+1][l2+1];
	   for(int i=0;i<=l1;i++){
	      for(int j=0;j<=l2;j++){
	        if(i==0 || j==0){
	           l[i][j]=0;
	        }
	        else{
	           if(x[i-1]==y[j-1]){
	             l[i][j]=l[i-1][j-1]+1;
	           }
	           else{
	             l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
	           }
	        }
	      }
	   }
	   int index=l[l1][l2];
	   char lcs[]=new char[index];
	   int i=l1;
	   int j=l2;
	   while(i>0 && j>0){
	     if(x[i-1]==y[j-1]){
	        lcs[index-1]=x[i-1];
	        i--;
	        j--;
	        index--;
	     }
	     else if(l[i-1][j]>l[i][j-1]){
	        i--;
	     }
	     else{
	       j--;
	     }
	   }
	   System.out.println(new String(lcs));
	}
}