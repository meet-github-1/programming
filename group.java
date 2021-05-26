import java.util.*;
import java.lang.*;
class group{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        boolean vis[]=new boolean[n];
        boolean flag1=true;
        while(count!=n){
            int prev=Integer.MIN_VALUE;
            int gm=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(!vis[i] && (arr[i]-prev==1 || prev==Integer.MIN_VALUE)){
                    prev=arr[i];
                    gm=gm+1;
                    vis[i]=true;
                }
                if(gm==s){
                    flag=true;
                    break;
                }
            }
            count=count+gm;
            if(!flag){
                flag1=false;
                break;
            }
            
        }
        System.out.println(flag1);
    }
}