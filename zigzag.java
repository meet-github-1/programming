import java.util.*;
class zigzag{
    /*static void swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
    }*/
    static int[] fun(int arr[],int x){
    	int temp;
         for(int i=0;i<x-1;i++){
            int i1=i;
            int i2=i+1;
            if(arr[i1]>arr[i2] && i%2==0){
            	//swap(arr[i1],arr[i2]);
                 temp=arr[i1];
                 arr[i1]=arr[i2];
                 arr[i2]=temp;
            	//System.out.println(Arrays.toString(arr));
            }
            if(arr[i2]>arr[i1] && i2%2==0){
            	 temp=arr[i1];
                 arr[i1]=arr[i2];
                 arr[i2]=temp;
                 //System.out.println(Arrays.toString(arr));
            }

         }
         //System.out.println(Arrays.toString(arr));
         return arr;
    }
	public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int fin[]=new int[n];
	        ArrayList<int[]> l=new ArrayList<int[]>();
	        for(int i=0;i<n;i++){
	            int x=in.nextInt();
	            fin[i]=x;
	            int arr[]=new int[x];
	            for(int j=0;j<x;j++){
	                arr[j]=in.nextInt();
	            }
	            //l[i]=new ArrayList<Integer>();
	            l.add(fun(arr,x));
	        }
	        for(int i[]:l){
	            for(int j:i){
	            	System.out.print(j+" ");
	            }

	            System.out.println();
	        }
	}
}