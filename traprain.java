import java.util.*;
import java.lang.*;
class traprain{
    static int getareatrap(int height[],int n){
        int left_max[]=new int[n];
        int right_max[]=new int[n];
        left_max[0]=height[0];
        right_max[n-1]=height[n-1];
        for(int i=1;i<n;i++){
           left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],height[i]);
        }
        int area=0;
        for(int i=0;i<n;i++){
           area+=Math.min(right_max[i],left_max[i])-height[i];
        }
        return area;
        
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	       arr[i]=in.nextInt();
	    }
	    System.out.println(getareatrap(arr,n));
	}
}