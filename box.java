import java.util.*;
import java.lang.*;
class box{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        String arr[]=in.nextLine().split(" ");
        for(String s:arr){
            pq.add(Integer.parseInt(s));
        }
        int x1,x2,diff;
        while(true){
            if(pq.size()==1 || pq.size()==0){
                break;
            }
            x1=pq.poll();
            x2=pq.poll();
            diff=x1-x2;
            if(diff>0){
                pq.add(diff);
            }
            
        }
        if(pq.size()==0){
            System.out.println(0);
            System.exit(1);
        }
        System.out.println(pq.poll());
    }
}