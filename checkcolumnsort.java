import java.util.*;
import java.lang.*;
class checkcolumnsort{
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  char arr[][]=new char[n][n];
	  long mul[]=new long[n+1];
	  mul[0]=-1;
	  int flag=0;
	  for(int i=0;i<n;i++){
	      String s=in.next();
	      long ml=1;
	      for(int j=0;j<n;j++){
	          arr[i][j]=s.charAt(j);
	          ml=ml*(int)arr[i][j];
	      }
	      mul[i+1]=ml;
	      if(mul[i+1]<mul[i]){
	          flag=1;
	      }
	  }
	  if(flag==0){
	      System.out.println("true");
	  }
	  else{
	      System.out.println("false");
	  }
	}
}