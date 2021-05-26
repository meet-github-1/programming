import java.util.*;
import java.lang.*;
class game{
    static int dp[][];
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[r][c];
        dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j]=arr[i][j]+((i==0 && j==0)?0:(i==0?dp[i][j-1]:(j==0?dp[i-1][j]:Math.min(dp[i-1][j],dp[i][j-1]))));
            }
        }
        /*for(int i[]:dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        System.out.println(dp[r-1][c-1]);
    }
}