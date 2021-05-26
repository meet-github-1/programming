import java.util.*;
import java.lang.*;
class Test1{
    int n;
    int k;
    int arr[];
    static Scanner in;
    static
    {
        in=new Scanner(System.in);
    }
    Test1(int n,int k){
        this.n=n;
        this.k=k;
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
    int subarraysum(int st,int ed){
        int sum=0;
        for(int i=st;i<=ed;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int n=in.nextInt();
        int k=in.nextInt();
        Test1 t=new Test1(n,k);
        int out[]=new int[k];
        for(int i=0;i<k;i++){
            out[i]=t.subarraysum(in.nextInt(),in.nextInt());
        }
        for(int i:out){
            System.out.print(i+" ");
        }
        
        
    }
}