import java.util.*;
import java.lang.*;
class rearrangesquare{
    static int largestsquarematrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int mxsq[][]=new int[r][c];
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    if(i==0 || j==0){
                        mxsq[i][j]=1;
                    }
                    else{
                        int min=0;
                        for(int k=j;k>0;k--){
                            min=Math.max(min,Math.min(mxsq[i][k-1],Math.min(mxsq[i-1][k-1],mxsq[i-1][j])));
                        }
                        mxsq[i][j]=1+min;
                    }
                    max=Math.max(max,mxsq[i][j]);
                }
            }
        }
        return max*max;
    }
    public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int r=in.nextInt();
         int c=in.nextInt();
         int arr[][]=new int[r][c];
         for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
              arr[i][j]=in.nextInt();
           }
         }
         System.out.println(largestsquarematrix(arr));
    }
}