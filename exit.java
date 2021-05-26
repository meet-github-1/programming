import java.util.*;
import java.lang.*;
class exit{
    static int max=99999;
    static boolean valid(int i,int j,int r,int c){
            return(i<r && i>=0 && j<c && j>=0);
    }
    static int nearestexit(int arr[][],int r,int c,int i,int j){
          if(!valid(i,j,r,c)){
             return max;
          }
          else if(arr[i][j]==1){
             return max;
          }
          else if(arr[i][j]==0){
             return 0;
          }
          else if(arr[i][j]==-1){
             return max;
          }
          else{
              arr[i][j]=1;
              int up=nearestexit(arr,r,c,i-1,j);
              int down=nearestexit(arr,r,c,i+1,j);
              int left=nearestexit(arr,r,c,i,j-1);
              int right=nearestexit(arr,r,c,i,j+1);
              arr[i][j]=500;
              return 1+Math.min(Math.min(Math.min(up,down),left),right);
          }

    }
    static int[][] getnearest(int arr[][],int r,int c){
          int fin[][]=new int[r][c];
          for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
               if(arr[i][j]==500){
                   fin[i][j]=nearestexit(arr,r,c,i,j);
               }
               else{
                  fin[i][j]=arr[i][j];
               }
             }
          }
          return fin;
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
	    int mat[][]=getnearest(arr,r,c);
	    for(int ar[]:mat){
	      for(int j:ar){
	         System.out.print(j+" ");
	      }
	      System.out.println();
	    }

	}
}