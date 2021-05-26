import java.util.*;
import java.lang.*;
import java.io.*;
class maxmin{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String ar[]=in.nextLine().split(" ");
	int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
	int sum=0;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i:arr){
	    sum=sum+i;
	    if(i>max) max=i;
	    if(i<min) min=i;
	}
	System.out.println((sum-max)+" "+(sum-min));
}
}