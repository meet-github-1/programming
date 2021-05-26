import java.util.*;
import java.lang.*;
import java.io.*;
class ratmaze{
    static int arr[][];
    static int dir[][]={{1,0},{0,1}};
    static boolean isindex(int i,int j,int n){
        if(i<0 || j<0 || i>=n || j>=n){
            return false;
        }
        return true;
    }
    static boolean traverse(int x,int y,int n){
        if(arr[n-1][n-1]==0){
            return false;
        }
        if(x==n-1 && y==n-1){
            return true;
        }
        if(!isindex(x,y,n) || arr[x][y]==0){
            return false;
        }
        else{
            for(int i=0;i<2;i++){
                
                if(traverse(x+dir[i][0],y+dir[i][1],n)){
                    return true;
                }
                
            }
            return false;
        }
    }
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     int n=in.nextInt();
	     arr=new int[n][n];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             arr[i][j]=in.nextInt();
	         }
	     }
	     System.out.println(traverse(0,0,n));
	     
	}
}