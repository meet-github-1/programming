import java.util.*;
import java.lang.*;
class creaturekilling1{
    static int maxdiamond(int arr[],int n){
        int sum=0,mx=-1,x;
        for(int i=n/2;i<=n;i++){
            x=i+1;
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+(x*arr[j]);
                
            }
            if(sum>mx){
                mx=sum;
            }
            
            
        }
        return mx;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int limb[]=new int[n];
        for(int i=0;i<n;i++){
            limb[i]=in.nextInt();
        }
        Arrays.sort(limb);
        System.out.println(maxdiamond(limb,n));
    }
}