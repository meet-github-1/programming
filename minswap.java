import java.util.*;
import java.lang.*;
class minswap{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr1[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}