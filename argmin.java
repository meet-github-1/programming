import java.util.*;
import java.lang.*;
class argmin{
 static String getargmin(int arr[][],int n){
       int mx=Integer.MAX_VALUE;
       int sum;
       String s="";
       for(int i=0;i<n;i++){
          int x=arr[i][0];
          int y=arr[i][1];
          sum=0;
         for(int j=0;j<n;j++){
              sum+=Math.pow(x-arr[j][0],2)+Math.pow(y-arr[j][1],2);
              }
              //System.out.println(sum);
         if(sum<mx){
              mx=sum;
              s=x+" "+y;
         }
       }
       //System.out.println(s);
       return s;
 }
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String fin[]=new String[n];
	for(int i=0;i<n;i++){
	      int k=in.nextInt();
	      int arr[][]=new int[k][2];
	      for(int j=0;j<k;j++){
                  arr[j][0]=in.nextInt();
                  arr[j][1]=in.nextInt();
	      }
	      fin[i]=getargmin(arr,k);
	}
	for(int i=0;i<n;i++){
		System.out.println(fin[i]);
	}
}
}