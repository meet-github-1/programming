import java.util.*;
import java.lang.*;
class villas{
    static int min;
    static void minimum(int cost[][],int n,int prev,int count,int tc){
        if(count==n){
            //System.out.println(tc);
            min=Math.min(min,tc);
            return ;
        }
        else{
            for(int i=0;i<3;i++){
                if(i!=prev){
                minimum(cost,n,i,count+1,tc+cost[count][i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cost[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                cost[i][j]=in.nextInt();
            }
        }
        min=Integer.MAX_VALUE;
        minimum(cost,n,-1,0,0);
        System.out.println(min);
    }
}