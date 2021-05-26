import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;
class pandals{
	static double even(int arr[],int n){
		int m1=n/2;
		int m2=(n/2)-1;
		return (arr[m1]+arr[m2])/2;
	}
	static double odd(int arr[],int n){
		int m1=(int)n/2;
		return arr[m1];
	}
	static double getshortest(int arr[]){
		int len=arr.length;
		Arrays.sort(arr);
		double mindis=0;
		double med=0;
		if(len%2==0){
              med=even(arr,len);
		}
		else{
			med=odd(arr,len);
		}
		//System.out.println(Arrays.toString(arr)+" "+mindis);
		for(int i=0;i<len;i++){
			mindis=mindis+Math.abs((arr[i]-med));

		}
		//System.out.println(Arrays.toString(arr)+" "+mindis);
		return mindis;
	}
       public static void main(String[] args){
       	Scanner in=new Scanner(System.in);
       	int nloc=in.nextInt();
       	double med[]=new double[nloc];
       	for(int i=0;i<nloc;i++){
       		int pd=in.nextInt();
       		int arr[]=new int[pd];
       		for(int j=0;j<pd;j++){
                    arr[j]=in.nextInt();
       		}
       		med[i]=getshortest(arr);
       }
       for(double el:med){
       	System.out.println((int)el);
       }
   }
	
}