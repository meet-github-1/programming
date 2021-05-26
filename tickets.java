import java.util.*;
import java.lang.*;
import java.io.*;
class tickets{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();

	}
	int flag=0;
	for(int i=0;i<n;i++){
	    mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
	    if(arr[i]>25){
	          if(arr[i]==50){
	            if(mp.getOrDefault(25,0)>=1){
	                 mp.put(25,mp.getOrDefault(25,0)-1);
	            }
	            else{
	              flag=1;
	            }


	          }
	          if(arr[i]==100){
	              if(mp.getOrDefault(50,0)>=1 && mp.getOrDefault(25,0)>=1){
	                   mp.put(50,mp.getOrDefault(50,0)-1);
	                   mp.put(25,mp.getOrDefault(25,0)-1);
	              }
	              else if(mp.getOrDefault(25,0)>=3){
	                   mp.put(25,mp.getOrDefault(25,0)-3);
	              }
	              else{
	                  flag=1;
	              }

	          }
	    }
	}
	System.out.println(flag==0);

	
	}
}