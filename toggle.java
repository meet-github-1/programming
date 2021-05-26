import java.util.*;
import java.lang.*;
class toggle{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        int arr[]=Arrays.asList(str).stream().mapToInt(Integer::parseInt).toArray();
        int d=0,mx=1;
        int prev=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(d!=-1 && arr[i]<prev){
                mx+=1;
                d=-1;
            }
            else if(d!=1 && arr[i]>prev){
                mx+=1;
                d=1;
            }
            prev=arr[i];
        }
        System.out.println(mx);
    }
}