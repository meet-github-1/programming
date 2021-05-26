import java.util.*;
import java.lang.*;
class sophos2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();

		}
		int psum=0,nsum=0;
		for(int i=0;i<n;i++){
			if(arr[i]>0){
				psum=psum+Math.abs(arr[i]);
			}
			if(arr[i]<0){
				nsum=nsum+Math.abs(arr[i]);
			}

		}
		System.out.println(Math.min(psum,nsum));
		
	}
}