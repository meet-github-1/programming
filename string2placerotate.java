/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class string2placerotate{
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    String s1=in.next();
		    String s2=in.next();
		    if((s1.substring(2,s1.length())+s1.substring(0,2)).equals(s2) || (s2.substring(2,s2.length())+s2.substring(0,2)).equals(s1)){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}