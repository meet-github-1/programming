import java.util.*;
import java.lang.*;
class minprice{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int fm=in.nextInt();
        int fr=in.nextInt();
        for(int i=0;i<fm;i++){
            pq.add(in.nextInt());
            
        }
        int sum=0;
        int arr[]=new int[fr];
        int i=0;
        while(!pq.isEmpty()){
            sum=sum+(arr[i]+1)*pq.poll();
            arr[i]=arr[i]+1;
            i=(i+1)%fr;
            
            
        }
        System.out.println(sum);
    }
}