import java.util.*;
import java.lang.*;
class offer{
    static int mcost=Integer.MAX_VALUE;
    static int get_sum(int arr[]){
        int sm=0;
        for(int i:arr){
            sm+=i;
        }
        return sm;
    }
    static void get_min(int n,int k,List<int[]> l,int []nitems,int sum,int x){
        int sm=get_sum(nitems);
        if(sm==0){
            mcost=Math.min(mcost,sum);
            return;
        }
        else{
            for(int i=x;i<k;i++){
                boolean flag=true;
                int arr1[]=new int[n];
                for(int j=0;j<n;j++){
                    int dff=nitems[j]-l.get(i)[j];
                    if(dff<0){
                        flag=false;
                        break;
                    }
                    arr1[j]=dff;
                }
                if(flag){
                    get_min(n,k,l,arr1,sum+l.get(i)[n],i);
                    //get_min(n,k,l,nitems,sum,i+1);
                }
                else{
                   get_min(n,k,l,nitems,sum,i+1); 
                }
            }
            return;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        List<int[]> l=new ArrayList<int[]>();
        for(int i=0;i<n;i++){
            int cost=in.nextInt();
            int arr[]=new int[n+1];
            for(int j=0;j<n;j++){
                arr[j]=0;
                if(i==j){
                    arr[j]=1;
                }
            }
            arr[n]=cost;
            l.add(arr);
        }
        for(int i=0;i<k;i++){
            int arr[]=new int[n+1];
            for(int j=0;j<=n;j++){
                arr[j]=in.nextInt();
            }
            l.add(arr);
        }
        int nitems[]=new int[n];
        for(int i=0;i<n;i++){
            nitems[i]=in.nextInt();
        }
        /*for(int[]ar:l){
            System.out.println(Arrays.toString(ar))
        }*/
        get_min(n,k+n,l,nitems,0,0);
        System.out.println(mcost);
    }
}