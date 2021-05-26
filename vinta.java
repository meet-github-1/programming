import java.util.*;
import java.lang.*;
class vinta{
    static int dp1[][];
    static int dp2[][];
    static int MIN=-99999;
    static void display(int arr[][],int r,int c){
       for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	           System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	     }
    }
    static boolean valid(int i,int j,int r,int c){
          return(i>=0 && i<r && j>=0 && j<c);
    }
    static int forward(int arr[][],int r,int c,int i,int j){
          if(!valid(i,j,r,c)){
              return MIN;
          }
          if(arr[i][j]==-1){
              return MIN;
          }
          if(i==r-1 && j==c-1){
              return arr[i][j];
          }
          if(dp1[i][j]!=-1){
             return dp1[i][j];
          }
          else{
               int down=forward(arr,r,c,i+1,j);
               int right=forward(arr,r,c,i,j+1);
               dp1[i][j]=arr[i][j]+Math.max(down,right);
               if(down>=right && down>=0){
                   arr[i+1][j]=0;
               }
               else if(right>=down && right>=0){
                   arr[i][j+1]=0;
               }
               return dp1[i][j];
          }
    }
    static int backward(int arr[][],int r,int c,int i,int j){
    	if(!valid(i,j,r,c)){
    		return MIN;
    	}
    	if(arr[i][j]==-1){
              return MIN;
          }
        if(i==0 && j==0){
              return arr[i][j];
          }
        if(dp2[i][j]!=-1){
             return dp2[i][j];
          }
        else{
               int up=backward(arr,r,c,i-1,j);
               int left=backward(arr,r,c,i,j-1);
               dp2[i][j]=arr[i][j]+Math.max(up,left);
               if(up>=left && up>=0){
                   arr[i-1][j]=0;
               }
               else if(left>=up && left>=0){
                   arr[i][j-1]=0;
               }
               return dp2[i][j];
          }
    }
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     int r=in.nextInt();
	     int c=in.nextInt();
	     int arr[][]=new int[r][c];
	     dp1=new int[r][c];
	     dp2=new int[r][c];
	     for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	           arr[i][j]=in.nextInt();
	           dp1[i][j]=-1;
	           dp2[i][j]=-1;
	        }
	     }
	     int max1=forward(arr,r,c,0,0);
	     if(arr[0][0]==1){
	     	 arr[0][0]=0;
	     }
	     //System.out.println(max1);
	     //display(arr,r,c);
	     int max2=backward(arr,r,c,r-1,c-1);
	     //System.out.println(max2);
	     //display(arr,r,c);
	     max1=max1<0?0:max1;
	     max2=max2<0?0:max2;
	     System.out.println(max1+max2);
	}
}