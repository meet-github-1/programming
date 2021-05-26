import java.util.*;
import java.lang.*;
class diamonds{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int len=arr.length;
        int cost[]=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        int dp[][]=new int[len][1];
        int ind[][]=new int[len][1];
        int max;
        for(int i=0;i<len;i++){
            max=0;
            ind[i][0]=i;
            for(int j=i+1;j<len;j++){
                if(cost[j]-cost[i]>max){
                    max=cost[j]-cost[i];
                    ind[i][0]=j;
                }
            }
            dp[i][0]=max;
        }
        /*for(int i=0;i<len;i++){
            //System.out.println(dp[i][0]);
            System.out.println(ind[i][0]);
        }*/
        int globalmax=Integer.MIN_VALUE;
        Queue<Integer> q=new LinkedList<Integer>();
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+dp[i][0];
            if(ind[i][0]!=0 && ind[i][0]+1<len){
                q.add(ind[i][0]+1);
                //System.out.println("index"+" "+ind[i][0]);
                while(!q.isEmpty()){
                    sum=sum+dp[q.peek()][0];
                    //System.out.println(dp[q.peek()][0]);
                    if(ind[q.peek()][0]+1<len){
                        q.add(ind[q.poll()][0]+1);
                    }
                    else{
                        q.poll();
                    }
                }
            }
            //System.out.println("sum"+" "+sum);
            globalmax=Math.max(globalmax,sum);
            sum=0;
        }
        //pp
        System.out.println(globalmax);
        
    }
}