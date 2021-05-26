import java.util.*;
import java.lang.*;
class diamondup{
	static int r;
	static int c;
	static boolean valid(int i,int j){
               if(j>=r || j<0 || i>=c || i<0) return false;
               return true;
	}
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  r=in.nextInt();
	  c=in.nextInt();
	  int arr[][]=new int[r][c];
	  for(int i=0;i<r;i++){
	     for(int j=0;j<c;j++){
	          arr[i][j]=in.nextInt();
	     }
	  }
	  for(int i=c-1;i>=0;i--){
	      for(int j=0;j<r;j++){
	      	int x=0,y=0,z=0;
	         if(valid(j,i+1)){
	            x=arr[j][i+1];
	         }
	         if(valid(j-1,i+1)){
	            y=arr[j-1][i+1];
	         }
	         if(valid(j+1,i+1)){
	            z=arr[j+1][i+1];
	         }
	         arr[j][i]=arr[j][i]+Math.max(Math.max(x,y),z);
	      }
	  }
	  int mx=Integer.MIN_VALUE;
	  for(int i=0;i<r;i++){
	     mx=Math.max(mx,arr[i][0]);
	  }
	  System.out.println(mx);
	}
}