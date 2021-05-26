import java.util.*;
import java.lang.*;
class samosamotu{
    static int fun(int x,int y){
        float f=(float)x/y;
        int res=(int)f;
        if(res==f){
            return res;
        }
        else return res+1;
    }
    static boolean possible(int arr[],int mid,int h){
        int sum=0;
        int count=0;
        for(int i:arr){
            if(i>=mid){
                //System.out.println(i/mid);
                count=count+fun(i,mid);
            }
            else{
              count++; 
            }
        }
        //System.out.println(count+" "+mid);
        if(count<=h){
            return true;
        }
        return false;
    }
    static int getminspeed(int arr[],int h){
        int st=1;
        int ed=0;
        for(int i:arr){
            ed=Math.max(ed,i);
        }
        int res=0;
        while(st<=ed){
            int mid=(st+ed)/2;
            if(possible(arr,mid,h)){
                res=mid;
                ed=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]=Arrays.asList(in.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int h=in.nextInt();
        //rp
        int ans=getminspeed(arr,h);
        System.out.println(ans);
    }
}