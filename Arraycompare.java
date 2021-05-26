/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Arraycompare{
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		loop1:
		while(n-->0){
		    int siz=in.nextInt();
		  //Map<Long,Long>mp1=new HashMap<Long,Long>();
		   //Map<Long,Long> mp2=new HashMap<Long,Long>();
		    long x;
		    long sum1=0,sum2=0;
		    long xr=0;
		    //long y=0;
		    for(int i=0;i<siz;i++){
		        x=in.nextLong();
		        sum1=sum1+x;
		        xr=xr^x;
		        //mp1.put(x,mp1.getOrDefault(x,y)+1);
		    }
		    for(int i=0;i<siz;i++){
		        x=in.nextLong();
		        sum2=sum2+x;
		        xr=xr^x;
		        //mp2.put(x,mp2.getOrDefault(x,y)+1);
		        
		    }
		 if(xr==0 && sum1==sum2){
		            //System.out.println(e.getKey()+" "+mp2.getOrDefault(e.getKey(),0));
		            System.out.println("1");
		            continue loop1;
		        }
		     System.out.println("0");
		}
	}
}