/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reverse{
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    String s1=in.next();
		    System.out.println(s1);
		    String s[]=s1.split("\\.");
		    System.out.println(Arrays.toString(s));
		    int len=s.length;
		    for(int j=len-1;j>0;j--){
		        System.out.print(s[j]+".");
		    }
		    System.out.print(s[0]);
		    System.out.println();
		}
	}
}