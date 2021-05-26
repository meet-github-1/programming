import java.util.*;
import java.lang.*;
import java.io.*;
class diagonalsum{
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     int n=in.nextInt();
	     int arr[][]=new int[n][n];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             arr[i][j]=in.nextInt();
	         }
	     }
	     int mid=n/2;
	     int x,y,sum=0;
	     x=0;y=0;
	     while(x<n && y<n){
	         sum+=arr[x][y];
	         if(x==mid && y==mid){
	             arr[x][y]=0;
	         }
	         x++;
	         y++;
	     }
	     x=0;y=n-1;
	     while(x<n && y>=0){
	         sum+=arr[x][y];
	         x++;
	         y--;
	     }
	     System.out.println(sum);
	}
}