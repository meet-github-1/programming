import java.util.*;
import java.lang.*;
class guess{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
         String arr[]=in.nextLine().split(" ");
         int len=arr[0].length();
         int count=0;
         int count1=0;
         int ar[]=new int[10];
         for(int i=0;i<len;i++){
             char c1=arr[0].charAt(i);
             char c2=arr[1].charAt(i);
             int ind1=c1-'0';
             int ind2=c2-'0';
             if(ind1==ind2){
                 count++;
             }
             else{
             if(ar[ind1]<0){
                 //System.out.println(c1);
                 ar[ind1]=ar[ind1]+1;
                 count1++;
             }
             else{
                 ar[ind1]=ar[ind1]+1;
             }
             if(ar[ind2]>0){
                 //System.out.println(c2);
                 ar[ind2]=ar[ind2]-1;
                 count1++;
             }
             else{
                 ar[ind2]=ar[ind2]-1;
             }
             }
             
         }
        
         
         System.out.println((count)+""+"A"+""+(count1)+""+"B");
    }
}