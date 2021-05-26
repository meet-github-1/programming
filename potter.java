import java.util.*;
import java.lang.*;
class potter{
    static int color(int arr[],int ind,int c,int n){
        if(ind==n){
            return 1;
        }
        else{
            int sum=0;
            for(int i=1;i<=c;i++){
                arr[ind]=i;
                if(arr[ind-1]!=arr[ind] || arr[ind+1]!=arr[ind]){
                    sum+=color(arr,ind+1,c,n);
                }
            }
            return sum;
        }
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=in.nextInt();
        int arr[]=new int[n+2];
        System.out.println( color(arr,1,c,n+1));
}
}