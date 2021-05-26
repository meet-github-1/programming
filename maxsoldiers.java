import java.util.*;
import java.lang.*;
class maxsoldiers{
	static boolean ifvalid(int x,int y,int r,int c){
		if(x<0 || y<0 || x>=r || y>=c) return false;
		return true;
	}
	static boolean traversesqaure(int arr[][],int x,int y,int mx,int r,int c){
		int prev=0;
		for(int i=0;i<mx;i++){
			if(!ifvalid(x,y+i,r,c) || arr[x][y+i]!=1) return false; 
			prev=y+i;
		}
		y=prev;
		for(int i=0;i<mx;i++){
			if(!ifvalid(x+i,y,r,c) || arr[x+i][y]!=1) return false;
			prev=x+i;
		}
		x=prev;
		for(int i=0;i<mx;i++){
			if(!ifvalid(x,y-i,r,c) || arr[x][y-i]!=1) return false;
			prev=y-i;

		}
		y=prev;
		for(int i=0;i<mx;i++){
			if(!ifvalid(x-i,y,r,c) || arr[x-i][y]!=1) return false;
		}
		return true;




	}
	static int formsqaures(int arr[][],int x,int y,int max,int r,int c){
		while(max>0){
			if(traversesqaure(arr,x,y,max,r,c)) return max*max;
			max=max-1;
		}
		return 0;
	}
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int r=in.nextInt();
	    int c=in.nextInt();
	    int arr[][]=new int[r][c];
	    for(int i=0;i<r;i++){
	    	for(int j=0;j<c;j++){
	    		arr[i][j]=in.nextInt();

	    	}
	    }
	    int max=Math.min(r,c);
	    int mx=-99999;
	    for(int i=0;i<r;i++){
	    	for(int j=0;j<c;j++){
	    		int mxp=formsqaures(arr,i,j,max,r,c);
	    		if(mxp==max*max){
	    			System.out.println(max*max);
	    			System.exit(1);
	    		}
	    		if(mxp>mx){
	    			mx=mxp;
	    		}

	    	}
	    }
	    System.out.println(mx);
	}
}