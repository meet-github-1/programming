import java.util.*;
import java.lang.*;
class led{
    static String format(int n){
        if(n<10){
            return "0"+""+n;
        }
        return ""+n;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        PriorityQueue<String> pq=new PriorityQueue<String>();
        for(int i=0;i<=11;i++){
            for(int j=0;j<=59;j++){
                int count1=Integer.bitCount(i);
                int count2=Integer.bitCount(j);
                if(count1+count2==n){
                    pq.add(i+":"+format(j)+" ");
                }
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}