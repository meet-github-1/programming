import java.util.*;
import java.lang.*;
class diamonds{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int len=arr.length;
        int cost[]=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        if(len<=1){
            System.out.println(0);
        }
        else{
            int buy[]=new int[len];
            int hold[]=new int[len];
            int sell[]=new int[len];
            hold[0]=-cost[0];
            buy[0]=0;
            sell[0]=Integer.MIN_VALUE;
            for(int i=1;i<len;i++){
                buy[i]=Math.max(buy[i-1],sell[i-1]);
                hold[i]=Math.max(hold[i-1],buy[i-1]-cost[i]);
                sell[i]=hold[i-1]+cost[i];
            }
            System.out.println(Math.max(buy[len- 1], sell[len- 1]));
        }
    }
}