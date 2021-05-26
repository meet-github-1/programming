import java.util.*;
import java.lang.*;
class mark{
	public static void main(String[] args){
	 Scanner in=new Scanner(System.in);
	 String ar[]=in.nextLine().split(" ");
	 int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
	 int count=0;
	 for(int i:arr){
	     if(i==0){
	         count++;
	     }
	     else{
	         System.out.print(i+" ");
	     }
	 }
	 for(int i=0;i<count;i++){
	     System.out.print(0+" ");
	 }
	 
	}
}