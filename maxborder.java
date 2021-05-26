import java.util.*;
import java.lang.*;
class maxborder{
    static int getmaxborder(int arr[][],int r,int c){
         int dphor[][]=new int[r][c];
         int dpver[][]=new int[r][c];
         for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(arr[i][j]==1){
                 if(i==0){
                    dpver[i][j]=1;
                 }
                 else{
                   dpver[i][j]=dpver[i-1][j]+1;
                 }
                 if(j==0){
                    dphor[i][j]=1;
                 }
                 else{
                  dphor[i][j]=dphor[i][j-1]+1;
                  }
               }
           }
         }
         int maxbord=0;
         for(int i=r-1;i>=1;i--){
              for(int j=c-1;j>=1;j--){
                   int len=Math.min(dphor[i][j],dpver[i][j]);
                   while(len>0){
                        boolean var=dpver[i][j-len+1]>=len && dphor[i-len+1][j]>=len;
                        if(var && len>maxbord){
                            maxbord=len;
                        }
                        len--;
                   }
              }
         }
         return maxbord;
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
       System.out.println(getmaxborder(arr,r,c));
	}
}