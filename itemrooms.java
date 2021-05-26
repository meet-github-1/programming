import java.util.*;
import java.lang.*;
class itemrooms{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        Integer arr[]=new Integer[n];
        int barr[]=new int[p];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<p;i++){
            barr[i]=in.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
        int count=0;
        int j=0;
        int ind=0;
        int counter=0;
        while(ind<n && counter<p){
            boolean flag=false;
            int i=arr[ind];
            if(barr[counter]>=i){
                count++;
                flag=true;
            }
            ind++;
            if(flag){
              counter++;
            }
        }
        System.out.println(count);
    }
}