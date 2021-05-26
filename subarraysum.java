/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class subarraysum{
    static String getindex(int arr[],int len,int sum){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
        int cummsum=0,rem=0;
        for(int i=0;i<arr.length;i++){
            cummsum=cummsum+arr[i];
            rem=cummsum%sum;
            //System.out.println(cummsum+" "+rem+" "+i);
            if((map.containsKey(rem)) || cummsum==sum){
            	//System.out.println("index"+" "+i);
                if(cummsum==sum){
                	//System.out.println(index+" "+"0");
                    return "1"+" "+Integer.toString(i+1);
                }
                //System.out.println((map1.get(map.get(rem))+" "+cummsum));
                if(Math.abs(map1.get(map.get(rem))-cummsum)==sum){
                    int ind=map.get(rem)+1;
                    //System.out.println(index+" "+"ind");
                    return Integer.toString(ind+1)+" "+Integer.toString(i+1);
                }
                else{
                	map.put(rem,-1);
                }
            }
            map1.put(i,cummsum);
            map.put(rem,i);
            
        }
        //System.out.println(arr[i-1]);
        //System.out.println(i);
        return "-1";
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String fin[]=new String[n];
		for(int i=0;i<n;i++){
		    int len=in.nextInt();
		    int sum=in.nextInt();
		    int arr[]=new int[len];
		    for(int j=0;j<len;j++){
		        arr[j]=in.nextInt();
		    }
		    fin[i]=getindex(arr,len,sum);
		    
		    
		}
		for(String s:fin){
		    System.out.println(s);
		}
	}
}