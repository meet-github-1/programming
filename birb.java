import java.util.*;
import java.lang.*;
class birb{
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[][]=new int[n][2];
	    for(int i=0;i<n;i++){
	       arr[i][0]=in.nextInt();
	       arr[i][1]=in.nextInt();
	    }
	    int i;
	    for(i=0;i<n;i++){
	         boolean flag=true;
	         int gol=arr[i][0]-arr[i][1];
	         if(gol>=0){
	            int n1=1; 
	            int j=(i+1)%n;
	            while(n1<n){
                   gol=gol+arr[j][0]-arr[j][1];
                   if(gol<0){
                     flag=false;
                   }
                   n1++;
                  j=(j+1)%n;
	            }
	            if(flag){
	               break;
	            }
	       }
	    }
	    if(i==n){
	    	System.out.println("-1");
	    }
	    else{
	    System.out.println(i);
	}
	}
}