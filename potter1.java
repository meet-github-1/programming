import java.util.*;
import java.lang.*;
class potter{
    static int count=0;
    static void color(int arr[],int ind,int c,int n){
        if(ind==n){
            count++;
            return;
        }
        else{
            for(int i=1;i<=c;i++){
                arr[ind]=i;
                if(arr[ind-1]!=arr[ind] || arr[ind+1]!=arr[ind]){
                    color(arr,ind+1,c,n);
                }
            }
            return;
        }
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=in.nextInt();
        int arr[]=new int[n+2];
        color(arr,1,c,n+1);
        System.out.println(count);
}
}