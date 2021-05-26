import java.util.*;
import java.lang.*;
class merge1{
    static int[] getarray(int arr[],int i1,int i2){
        int ar[]=new int[i2-i1+1];
        int st=0;
        for(int i=i1;i<=i2;i++){
            ar[st]=arr[i];
            st++;
        }
        return ar;
    }
     static int getmedian(int l[],int h[],int n){
        while(true){
            int l1=l.length;
            int l2=h.length;
             int m1=l[l1/2];
             int m2=h[l2/2];
            if(m1==m2){
                return m1;
            }
            else if(l1<=2 || l2<=2){
                break;
                }
            else if(m1>m2){
                l=getarray(l,0,l1/2);
                h=getarray(h,l2/2,l2-1);
                }
            else{
               l=getarray(l,l1/2,l1-1);
               h=getarray(h,0,l2/2); 
            } 
            }
            return(Math.max(l[0],h[0])+Math.min(l[1],h[1]))/2;
     }
     public static void main(String[] args){
            Scanner in=new Scanner(System.in);
             int n=in.nextInt();
             int l[]=new int[n];
             int h[]=new int[n];
             for(int i=0;i<2;i++){
                for(int j=0;j<n;j++){
                   if(i==0){
                       l[j]=in.nextInt();
                   }
                   else{
                       h[j]=in.nextInt();
                   }
                }
                }
                int med=getmedian(l,h,n);
                System.out.println(med);
                
     }
}