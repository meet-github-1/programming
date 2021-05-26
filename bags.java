import java.util.*;
import java.lang.*;
class bags{
    static boolean binarysearch(int arr[],int low,int high,int key){
        if(low>high){
            return false;
        }
        else{
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return true;
            }
            else if(key>arr[mid]){
                return binarysearch(arr,mid+1,high,key);
            }
            else{
                return binarysearch(arr,low,mid-1,key);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[r][c];
        int i=0;
        for(i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int j=0;j<c;j++){
            int wt=arr[0][j];
            i=0;
            boolean flag=true;
            for(int ar[]:arr){
                if(i!=0 && !binarysearch(ar,0,c-1,wt)){
                    flag=false;
                    break;
                }
                i++;
            }
            if(flag){
               System.out.println(wt);
               System.exit(1);
            }
        }
        System.out.println("-1");
    }
}