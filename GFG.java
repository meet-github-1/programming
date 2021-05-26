/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String getmissing(int arr[],int len){
         Map<Integer,Integer> map=new HashMap<Integer,Integer>();
         String s="";
         long sum=0,count=0;
         for(int i:arr){
         	if(map.containsKey(i)){
         		s=s+Integer.toString(i);
         		continue;

         	}
         	map.put(i,1);
         	sum=sum+i;
         	//System.out.println(i);
         }
         double l=(double)len;
         Long fsum=(long)((l)*((l+1)/2));
         count=(fsum-sum);
         //System.out.println(s);
         //System.out.println(s);
         return s+" "+Long.toString(count);

    }
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	       int n=in.nextInt();
	       String fin[]=new String[n];
	       for(int i=0;i<n;i++){
	            int len=in.nextInt();
	            int arr[]=new int[len];
	            for(int j=0;j<len;j++){
	            arr[j]=in.nextInt();

	            }
	            fin[i]=getmissing(arr,len);

	       }
	       for(String s:fin){
	       System.out.println(s);
	       }
	}
}