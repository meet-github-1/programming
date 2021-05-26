import java.util.*;
import java.lang.*;
import java.io.*;
class graphcolour{
    static int arr[][];
    static int cr[];
    static boolean isnoduplicate(int x,int col,int n){
        for(int i=0;i<n;i++){
            if(arr[x][i]==1 && cr[i]==col){
                    return false;
            }
        }
        return true;
        
    }
    static boolean ispossible(int n,int p,int vis){
        if(vis>=n){
            return true;
        }
    for(int i=1;i<=p;i++){
        if(isnoduplicate(vis,i,n)){
                cr[vis]=i;
                if(ispossible(n,p,vis+1)){
                    return true;
                  }
               cr[vis]=0;
            }
        }
        return false;
        
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int p=in.nextInt();
	arr=new int[n][n];
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        arr[i][j]=in.nextInt();
	    }
	}
	cr=new int[n];
	System.out.println(ispossible(n,p,0));
	}
}