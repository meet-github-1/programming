import java.util.*;
import java.lang.*;
class switchon{
    static boolean ispossible(int arr[],int n,int k,int st,int co){
        if(co==k){
            return true;
        }
        else{
         for(int i=st;i<n;i++){
            if(arr[i]==0 && (arr[i-1]!=1 && arr[i+1]!=1)){
                arr[i]=1;
                if(ispossible(arr,n,k,i+1,co+1)){
                    return true;
                }
                arr[i]=0;
            }
            }
            return false;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int[n+2];
        for(int i=1;i<=n;i++){
            arr[i]=in.nextInt();
        }
        arr[0]=0;
        arr[n+1]=0;
        System.out.println(ispossible(arr,n+1,k,1,0));
    }
}