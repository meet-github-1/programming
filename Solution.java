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
    static BigInteger fac(long num){
        BigInteger sum=new BigInteger("1");
        for(int i=2;i<=num;i++){
            sum=sum.multiply(BigInteger.valueOf(i));

        }
        return sum;
    }
    static Long countTriplets(List<Long> arr, long r) {
        int len=arr.size();
        Map<Long,Integer> map=new HashMap<Long,Integer>();
        for(int i=0;i<len;i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
        }
        Long count=(long)0;
        for(int i=0;i<len;i++){
            if(map.getOrDefault(arr.get(i),0)>0){
            Long r1=arr.get(i)*r;
            Long r2=r1*r;
            //System.out.println(map.getOrDefault(r1,0)+" "+map.getOrDefault(r2,0));
            if(map.getOrDefault(r1,0)>0 && map.getOrDefault(r2,0)>0){
                if(r!=1){
              int x=map.get(r1)*map.get(r2);
              count++;
              count=count+map.get(arr.get(i))*x;
              map.put(arr.get(i),0);
              //System.out.println(count);
            }
            else{
                int x=map.get(arr.get(i));
                //System.out.println(x);
                //System.out.println(fac(x)+" "+fac(x-3)+" "+fac(3));
                BigInteger res=(fac(x).divide((fac(x-3).multiply(fac(3)))));
                count=count+res.longValue();
                //System.out.println(count);
                map.put(arr.get(i),0);


            }
        }
            
            }

        }
        System.out.println(count);
        return count;


    }

    public static void main(String[] args) throws IOException {
       int n,r;
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       r=in.nextInt();
       List<Long> p=new ArrayList<Long>();
       for(int i=0;i<n;i++){
       p.add(in.nextLong());
       }
       System.out.println(p.size());
       countTriplets(p,r);
    }
}
