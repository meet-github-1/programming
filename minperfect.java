import java.util.*;
import java.lang.*;
class minperfect{
	static int fun(int n){
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		for(int i=4;i<=n;i=i+1){
			arr[i]=i;
			for(int j=1;j<=i;j=j+1){
				int temp=j*j;
			    if(temp>i){
					break;
				}
				else{
					arr[i]=Math.min(arr[i],1+arr[i-temp]);
				}
			}
		}
		return arr[n];
	}
    public static void main(String[] args){
      System.out.println("enter the number");
	  Scanner in =new Scanner(System.in);
	  int n=in.nextInt();
	  System.out.println(fun(n));
	}
}
