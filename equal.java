import java.util.*;
import java.lang.*;
class equal{
    static int MAX=99999;
    static int sum(int arr[]){
       int sum=0;
       for(int i:arr){
          sum+=i;
       }
       return sum;
    }
    static boolean greater(int arr[],int d){
       for(int i:arr){
          if(i==0){
             continue;
          }
          if(i<d){
            return false;
          }
       }
       return true;
    }
    static int[] getarray(int arr[],int n,int diff){
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
           if(arr[i]==0){
              arr1[i]=0;
           }
           else{
             arr1[i]=arr[i]-diff;
           }
        }
        return arr1;
    }
    static int minstep(int arr[],int n,int st[]){
        if(sum(arr)==0){
            return 0;
        }
        else{
           int mn=MAX;
           for(int i:st){
              if(greater(arr,i)){
              int arr1[]=getarray(arr,n,i);
              mn=Math.min(mn,1+minstep(arr1,n,st));
              //System.out.println(Arrays.toString(arr)+" "+mn);
              }
           }
           return mn;
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int  n=in.nextInt();
	    int arr[]=new int[n];
	    int st[]=new int[]{1,2,5};
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	       arr[i]=in.nextInt();
	       min=Math.min(min,arr[i]);
	    }
	    for(int i=0;i<n;i++){
	      arr[i]=arr[i]-min;
	    }
	    //System.out.println(min);
	    System.out.println(minstep(arr,n,st));
	}
}