import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long fac(long num){
        long sum=1;
        for(long i=2;i<=num;i++){
            sum=sum*i;

        }
        return sum;
    }
    static long countTriplets(List<Long> arr, long r) {
        int len=arr.size();
        Map<Long,Integer> map=new HashMap<Long,Integer>();
        for(int i=0;i<len;i++){
            map.put(arr.get(i),map.getOrDefault(i,0)+1);
        }
        long count=0;
        for(int i=0;i<len;i++){
            if(map.getOrDefault(arr.get(i),0)>0){
            Long r1=arr.get(i)*r;
            Long r2=r1*r;
            System.out.println(r1+" "+r2);
            if(map.getOrDefault(r1,0)>0 && map.getOrDefault(r2,0)>0){
                if(r!=1){
              int x=map.get(r1)*map.get(r2);
              count++;
              count=count+map.get(arr.get(i))*x;
              map.put(arr.get(i),0);
              System.out.println(count);
            }
            }
            else{
                int x=map.get(arr.get(i));
                count=count+(fac(x)/(fac(x-3)*fac(3)));


            }
            
            }

        }
        System.out.println(count);
        return count;


    }

    public static void main(String[] args) throws IOException {
       int n,r;
       n=in.nextInt();
       r=in.nextInt();
       List<Long> p=new ArrayList<Long>();
       for(int i=0;i<n;i++){
       p.add(in.nextLong());
       }
       countTriplets(p,r);
    }
}
