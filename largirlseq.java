import java.util.*;
import java.lang.*;
class largirlseq{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        int arr[]=new int[n];
        int i=0;
        int j=-1;
        int count=0;
        int max=0;
        boolean flag=true;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        i=-1;
        //p
        //System.out.println(i+" "+j);
        while(i<n && j<n){
            //System.out.println(i+" "+j);
            if(i>=0 && flag && arr[i]==0){
                count++;
            }
            if(j>=0 && !flag && arr[j]==0){
                count--;
            }
            if(count>r){
                //System.out.println(i+" "+j);
                max=Math.max(max,(i-j));
                j++;
                flag=false;
            }
            else if(count<=r){
                //System.out.println(count);
                i++;
                flag=true;
            }
            
        }
        if(count==r){
            max=Math.max(max,(i-j));
        }
        System.out.println(max-1);
    }
}