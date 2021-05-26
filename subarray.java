import java.util.*;
import java.lang.*;
class subarray{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
         for (int i = 0; i < n; ++i) {
            sum += ((i + 1) * (n - i) + 1) / 2 * ar[i];
        }
        System.out.println(sum);
    }
}