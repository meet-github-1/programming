import java.util.*;
import java.lang.*;
import java.io.*;
class nqueen{
	static int board[][];
	static boolean isnoattack(int i,int j,int n){
	    int x,y;
	    for(y=j-1;y>=0;y--){
	        if(board[i][y]==1){
	            return false;
	        }
	    }
	    x=i-1;
	    y=j-1;
	    while(x>=0 && y>=0){
	        if(board[x][y]==1){
	            return false;
	        }
	        x--;
	        y--;
	        
	    }
	    x=i+1;
	    y=j-1;
	    while(x<n && y>=0){
	        if(board[x][y]==1){
	            return false;
	        }
	        x++;
	        y--;
	    }
	return true;
	}
	static boolean ispossible(int n,int col){
	    if(col==n){
	        return true;
	    }
	    else{
	        for(int i=0;i<n;i++){
	            if(isnoattack(i,col,n)){
	                board[i][col]=1;
	                if(ispossible(n,col+1)){
	                    return true;
	                }
	                else{
	                    board[i][col]=0;
	                }
	            }
	        }
	        return false;
	    }
	}
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 board=new int[n][n];
	 boolean res=ispossible(n,0);
	 for(int i=0;i<n;i++){
	   for(int j=0;j<n;j++){
	       System.out.print(board[i][j]+" " );
	         }
	       System.out.println();
	     }
	}
}