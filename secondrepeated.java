/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class secondrepeated{
	static String getsecondmostrepeated(String arr[]){
		Map<String,Integer> mp=new HashMap<String,Integer>();
		String ar[]=new String[100];
		int high=0;
		for(String s:arr) mp.put(s,mp.getOrDefault(s,0)+1);
		for(String s:mp.keySet()){
			int val=mp.get(s);
			if(val>high) high=val;
			ar[val]=s;
		}
		high--;
		while(!(ar[high]!=null) && high>0){
			high--;
		}
		return ar[high];
	}
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		while(n-->0){
		    int x=Integer.parseInt(bf.readLine());
		    String arr[]=bf.readLine().split(" ");
		    System.out.println(getsecondmostrepeated(arr));
		    
		}
	}
}