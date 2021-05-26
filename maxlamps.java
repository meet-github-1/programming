import java.util.*;
import java.lang.*;
import java.io.*;
class maxlamps{
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	   int n=in.nextInt();
	   int mx=-999999;
	   int temp;
	   for(int i=0;i<n;i++){
	       temp=in.nextInt();
	       if(temp>mx){
	           mx=temp;
	       }
	       mp.put(temp,mp.getOrDefault(temp,0)+1);
	       
	       
	   }
	   System.out.println(mp.getOrDefault(mx,0));
	   
	}
}