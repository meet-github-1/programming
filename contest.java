import java.util.*;
import java.lang.*;
import java.io.*;
class contest{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String ar[]=in.nextLine().split(" ");
	    int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
        int prod=1;
        int flag=0;
        for(int i:arr){
        	if(i==0){
        		flag=1;
        	}
        	else{
        	prod=prod*i;
        	//System.out.println(prod);
        }


        }
        //System.out.println(prod);
        if(flag==0){
        	for(int i:arr){
        		System.out.print(prod/i+" ");
        	}
        }
        else{
        	for(int i:arr){
        		if(i==0){
        		System.out.print(prod+" ");
        	}
        	else{
        		System.out.print(0+" ");
        	}
        }
    }

	}
}