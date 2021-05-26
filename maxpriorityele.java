import java.util.*;
import java.lang.*;
class maxpriorityele{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }//p
        int count=1;
        int ele=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==ele){
                count++;
            }
            else{
                count--;
                if(count==0){
                    //System.out.println(count+" "+i);
                    ele=arr[i];
                    count=1;
                }
            }
        }
        System.out.println(ele);
    }
}