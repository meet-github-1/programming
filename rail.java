import java.util.*;
class rail{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String sarr[]=s.nextLine().split(" ");
        String sarr1[]=s.nextLine().split(" ");
        int arr1[]=Arrays.asList(sarr).stream().mapToInt(Integer::parseInt).toArray();
        int arr2[]=Arrays.asList(sarr1).stream().mapToInt(Integer::parseInt).toArray();
        int tol=0,rem,sm=0,stind=0;
        for(int i=0;i<arr1.length;i++){
            rem=arr1[i]-arr2[i];
            if(sm>=0){
                sm+=rem;
            }
            else{
                sm=rem;
                stind=i;
            }
            tol+=rem;
        }
        if(tol>=0){
            System.out.println(stind);
        }
        else{
            System.out.println(-1);
        }
    }
}