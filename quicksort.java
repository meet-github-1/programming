import java.util.*;
class quicksort{
	static int partition(int ar[],int l,int h){
		int pivot=ar[h];
		int i=l-1,temp=0;
		 for(int j=l;j<h;j++){
		 	if(ar[j]<pivot){
		 		System.out.println(Arrays.toString(ar));
		 		i++;
		 		temp=ar[i];
		 		ar[i]=ar[j];
		 		ar[j]=temp;
		 		System.out.println(Arrays.toString(ar)+" "+i+" "+j);
		 	}

		 }
		 i++;
         temp=ar[i];
         ar[i]=ar[h];
         ar[h]=temp;
		 return i;
	}
     static void quick(int ar[],int l,int h){
     	if(l<h){
     	   int ind=partition(ar,l,h);
     	   quick(ar,l,ind-1);
     	   quick(ar,ind+1,h);
     	}
     }
	 public static void main(String[] args){
            Scanner in=new Scanner(System.in);
	       String arr[]=in.nextLine().split(" ");
	       int ar[]=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
	       quick(ar,0,ar.length-1);
	       System.out.println("arr="+Arrays.toString(ar));

	 }
}